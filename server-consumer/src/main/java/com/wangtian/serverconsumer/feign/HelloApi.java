package com.wangtian.serverconsumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author wangtian
 */
@FeignClient("provide-server")
public interface HelloApi {

    @RequestMapping(value = "/hi")
    String hi(@RequestParam("id") String id);
}
