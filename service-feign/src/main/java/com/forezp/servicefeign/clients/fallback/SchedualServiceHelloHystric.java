package com.forezp.servicefeign.clients.fallback;

import com.forezp.servicefeign.clients.SchedualServiceHello;
import org.springframework.stereotype.Component;

/**
 * @Author: chenglvpeng
 * @Date: 2019/3/4  19:52
 * @Description:
 * @注意：本内容仅限于杭州阿拉丁信息科技股份有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
@Component
public class SchedualServiceHelloHystric implements SchedualServiceHello {

    @Override
    public String sayHelloFromClientOne(int age) {
        return "error!!! " + age;
    }
}
