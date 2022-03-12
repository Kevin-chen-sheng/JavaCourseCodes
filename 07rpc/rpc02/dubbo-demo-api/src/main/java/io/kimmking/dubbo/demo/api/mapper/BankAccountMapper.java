package io.kimmking.dubbo.demo.api.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.kimmking.dubbo.demo.api.BankAccount;

/**
 * @author da
 * @version 1.0
 * @description: TODO
 * @date 2022年03月12日 19:41
 */
public interface BankAccountMapper extends BaseMapper<BankAccount> {

    boolean subtractAccountBalance(int customerId, int num, int amount);

    void addAccountBalance(int customerId, int num, int amount);
}
