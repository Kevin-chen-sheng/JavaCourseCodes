package io.kimmking.dubbo.demo.api;

/**
 * @author da
 * @date 2022年03月12日 19:01
 */
public interface BankAccountService {
    void subtractAccountBalance(String tid, int customerId, int amount);
    void addAccountBalance(String tid, int customerId, int amount);
}
