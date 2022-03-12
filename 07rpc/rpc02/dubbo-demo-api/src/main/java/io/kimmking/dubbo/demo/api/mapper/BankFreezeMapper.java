package io.kimmking.dubbo.demo.api.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.kimmking.dubbo.demo.api.BankAccount;
import io.kimmking.dubbo.demo.api.BankFreeze;

/**
 * @author da
 * @version 1.0
 * @description: TODO
 * @date 2022年03月12日 19:41
 */
public interface BankFreezeMapper extends BaseMapper<BankFreeze> {
    void subtractFreezeAmount(int customerId, int num, int amount);
}
