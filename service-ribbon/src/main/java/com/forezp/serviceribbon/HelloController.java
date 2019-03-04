package com.forezp.serviceribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: chenglvpeng
 * @Date: 2019/3/4  16:20
 * @Description:
 * @注意：本内容仅限于杭州阿拉丁信息科技股份有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;

    @GetMapping("/hi")
    public String hi(@RequestParam String name) {
        return helloService.hiService(name);
    }
}
