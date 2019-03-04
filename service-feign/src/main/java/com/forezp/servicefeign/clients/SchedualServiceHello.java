package com.forezp.servicefeign.clients;

import com.forezp.servicefeign.clients.fallback.SchedualServiceHelloHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: chenglvpeng
 * @Date: 2019/3/4  19:51
 * @Description:
 * @注意：本内容仅限于杭州阿拉丁信息科技股份有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
@FeignClient(value = "service-hi",fallback = SchedualServiceHelloHystric.class)
public interface SchedualServiceHello {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
     String sayHelloFromClientOne(@RequestParam(value = "age") int age);

}
