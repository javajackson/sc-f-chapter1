package com.forezp.servicefeign.web;

import com.forezp.servicefeign.clients.SchedualServiceHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: chenglvpeng
 * @Date: 2019/3/4  19:54
 * @Description:
 * @注意：本内容仅限于杭州阿拉丁信息科技股份有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
@RestController
public class HelloController {
    @Autowired
    private SchedualServiceHello schedualServiceHello;

    @GetMapping(value = "/hello")
    public String sayHello(@RequestParam int age) {
        return schedualServiceHello.sayHelloFromClientOne(age);
    }
}
