package io.kimmking.dubbo.demo.api.mapper.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.sun.org.apache.regexp.internal.RE;
import io.kimmking.dubbo.demo.api.BankAccount;
import io.kimmking.dubbo.demo.api.mapper.BankAccountMapper;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * @author da
 * @version 1.0
 * @description: TODO
 * @date 2022年03月12日 20:13
 */
public class BankAccountMapperImpl implements BankAccountMapper {
    @Override
    public boolean subtractAccountBalance(int customerId, int num, int amount) {

        QueryWrapper<BankAccount> bankAccountQueryWrapper = new QueryWrapper<>();
        bankAccountQueryWrapper.eq("customer_id",customerId);
        bankAccountQueryWrapper.eq("account_type",num);
        List<BankAccount> bankAccounts = this.selectList(bankAccountQueryWrapper);
        Long balance = bankAccounts.get(0).getBalance();

        UpdateWrapper<BankAccount> bankAccountQueryWrapper1 = new UpdateWrapper<>();
        bankAccountQueryWrapper1.eq("customer_id",customerId);
        bankAccountQueryWrapper1.eq("account_type",num);
        bankAccountQueryWrapper1.set("balance",balance-amount);

        int update = this.update(bankAccounts.get(0), bankAccountQueryWrapper1);

        if(update==1){
            return true;
        }

        return false;
    }

    @Override
    public void addAccountBalance(int customerId, int num, int amount) {

        QueryWrapper<BankAccount> bankAccountQueryWrapper = new QueryWrapper<>();
        bankAccountQueryWrapper.eq("customer_id",customerId);
        bankAccountQueryWrapper.eq("account_type",num);
        List<BankAccount> bankAccounts = this.selectList(bankAccountQueryWrapper);
        Long balance = bankAccounts.get(0).getBalance();

        UpdateWrapper<BankAccount> bankAccountQueryWrapper1 = new UpdateWrapper<>();
        bankAccountQueryWrapper1.eq("customer_id",customerId);
        bankAccountQueryWrapper1.eq("account_type",num);
        bankAccountQueryWrapper1.set("balance",balance+amount);

         this.update(bankAccounts.get(0), bankAccountQueryWrapper1);
    }

    @Override
    public int insert(BankAccount entity) {
        return 0;
    }

    @Override
    public int deleteById(Serializable id) {
        return 0;
    }

    @Override
    public int deleteByMap(Map<String, Object> columnMap) {
        return 0;
    }

    @Override
    public int delete(Wrapper<BankAccount> wrapper) {
        return 0;
    }

    @Override
    public int deleteBatchIds(Collection<? extends Serializable> idList) {
        return 0;
    }

    @Override
    public int updateById(BankAccount entity) {
        return 0;
    }

    @Override
    public int update(BankAccount entity, Wrapper<BankAccount> updateWrapper) {
        return 0;
    }

    @Override
    public BankAccount selectById(Serializable id) {
        return null;
    }

    @Override
    public List<BankAccount> selectBatchIds(Collection<? extends Serializable> idList) {
        return null;
    }

    @Override
    public List<BankAccount> selectByMap(Map<String, Object> columnMap) {
        return null;
    }

    @Override
    public BankAccount selectOne(Wrapper<BankAccount> queryWrapper) {
        return null;
    }

    @Override
    public Integer selectCount(Wrapper<BankAccount> queryWrapper) {
        return null;
    }

    @Override
    public List<BankAccount> selectList(Wrapper<BankAccount> queryWrapper) {
        return null;
    }

    @Override
    public List<Map<String, Object>> selectMaps(Wrapper<BankAccount> queryWrapper) {
        return null;
    }

    @Override
    public List<Object> selectObjs(Wrapper<BankAccount> queryWrapper) {
        return null;
    }

    @Override
    public IPage<BankAccount> selectPage(IPage<BankAccount> page, Wrapper<BankAccount> queryWrapper) {
        return null;
    }

    @Override
    public IPage<Map<String, Object>> selectMapsPage(IPage<BankAccount> page, Wrapper<BankAccount> queryWrapper) {
        return null;
    }
}
