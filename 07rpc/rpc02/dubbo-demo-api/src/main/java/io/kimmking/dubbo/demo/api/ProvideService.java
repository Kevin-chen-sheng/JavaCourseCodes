package io.kimmking.dubbo.demo.api;

import org.dromara.hmily.annotation.Hmily;

/**
 * @author da
 * @date 2022年03月12日 18:53
 */
public interface ProvideService {
    @Hmily
    Boolean transfer(String tid,int customerId,int amount);
}
