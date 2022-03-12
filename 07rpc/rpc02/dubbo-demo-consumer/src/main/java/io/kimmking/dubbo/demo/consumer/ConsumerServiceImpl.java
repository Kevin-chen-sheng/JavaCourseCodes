package io.kimmking.dubbo.demo.consumer;

import io.kimmking.dubbo.demo.api.BankAccountService;
import io.kimmking.dubbo.demo.api.ConsumerService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author da
 * @version 1.0
 * @description: TODO
 * @date 2022年03月12日 19:14
 */
@DubboService(version = "1.0.0", tag = "red", weight = 100)
public class ConsumerServiceImpl implements ConsumerService {
    @Autowired
    BankAccountService bankAccountService;

    @Override
    public Boolean transfer(String tid,int customerId, int amount) {
        this.bankAccountService.addAccountBalance(tid,customerId,amount);
        return true;
    }
}
