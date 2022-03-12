package io.kimmking.dubbo.demo.consumer;

import io.kimmking.dubbo.demo.api.BankAccountService;
import io.kimmking.dubbo.demo.api.CancelLog;
import io.kimmking.dubbo.demo.api.ConfirmLog;
import io.kimmking.dubbo.demo.api.TryLog;
import io.kimmking.dubbo.demo.api.mapper.BankAccountMapper;
import io.kimmking.dubbo.demo.api.mapper.CancelLogMapper;
import io.kimmking.dubbo.demo.api.mapper.ConfirmLogMapper;
import io.kimmking.dubbo.demo.api.mapper.TryLogMapper;
import lombok.extern.slf4j.Slf4j;
import org.dromara.hmily.annotation.HmilyTCC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * @author da
 * @version 1.0
 * @description: TODO
 * @date 2022年03月12日 19:16
 */
@Component
@Slf4j
public class ConsumerAccountImpl implements BankAccountService {


    @Autowired
    BankAccountMapper bankAccountDao;

    @Autowired
    TryLogMapper tryLogDao;

    @Autowired
    ConfirmLogMapper confirmLogDao;

    @Autowired
    CancelLogMapper cancelLogDao;

    @Override
    public void subtractAccountBalance(String tid,int customerId, int amount) {

    }

    @Override
    @HmilyTCC(confirmMethod = "confirm", cancelMethod = "cancel")
    public void addAccountBalance(String tid,int customerId, int amount) {
        log.info("bank2 addAccountBalance try begin ... tid is {} customerId is {} amount is {} ！！！", tid, customerId, amount);
        //幂等校验
        if(tryLogDao.selectById(tid)==null) {
            TryLog tryLog = new TryLog();
            tryLog.setTx_no(tid);
            tryLog.setCreateTime(new Date());
            tryLogDao.insert(tryLog);
        }
        log.info("bank2 addAccountBalance try end ... tid is {} customerId is {} amount is {} ！！！", tid, customerId, amount);

    }


    @Transactional(rollbackFor = Exception.class)
    public boolean confirm(String tid,int customerId, int amount) {
        log.info("bank2 confirm begin ... tid is {} customerId is {} amount is {} ！！！", tid, customerId, amount);
        //幂等校验 且try执行完成
        if(confirmLogDao.selectById(tid)==null){
            if(tryLogDao.selectById(tid)!=null) {
                bankAccountDao.addAccountBalance(customerId, 2, amount);
                log.info("账户 {} 收款金额 {} 成功！！！", customerId, amount);

                ConfirmLog confirmLog = new ConfirmLog();
                confirmLog.setTx_no(tid);
                confirmLog.setCreateTime(new Date());
                confirmLogDao.insert(confirmLog);
            }
        }
        log.info("bank2 confirm end ... tid is {} customerId is {} amount is {} ！！！", tid, customerId, amount);
        return Boolean.TRUE;
    }

    @Transactional(rollbackFor = Exception.class)
    public boolean cancel(String tid,int customerId, int amount) {
        log.info("bank2 cancel begin ... tid is {} customerId is {} amount is {} ！！！", tid, customerId, amount);
        //幂等校验 且try执行完毕
        if(cancelLogDao.selectById(tid)==null){
            if(tryLogDao.selectById(tid)!=null) {
                bankAccountDao.subtractAccountBalance(customerId, 2, amount);

                CancelLog cancelLog = new CancelLog();
                cancelLog.setTx_no(tid);
                cancelLog.setCreateTime(new Date());
                cancelLogDao.insert(cancelLog);
            }
        }

        log.info("bank2 cancel end ... tid is {} customerId is {} amount is {} ！！！", tid, customerId, amount);
        return Boolean.TRUE;
    }

}

