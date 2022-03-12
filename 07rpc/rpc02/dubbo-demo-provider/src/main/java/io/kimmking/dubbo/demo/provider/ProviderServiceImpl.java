package io.kimmking.dubbo.demo.provider;

import io.kimmking.dubbo.demo.api.BankAccountService;
import io.kimmking.dubbo.demo.api.ProvideService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author da
 * @version 1.0
 * @description: TODO
 * @date 2022年03月12日 18:57
 */
@DubboService(version = "1.0.0", tag = "red", weight = 100)
public class ProviderServiceImpl implements ProvideService {
    @Autowired
    BankAccountService bankAccountService;

    @Override
    public Boolean transfer(String tid,int customerId, int amount) {
        this.bankAccountService.subtractAccountBalance(tid,customerId,amount);
        return true;
    }
}
