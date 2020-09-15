package tdoo.demo.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tdoo.demo.aop.srevice.AopService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoAopApplicationTests {


    @Autowired
    private AopService aopService;

    @Test
    public void contextLoads() {
        aopService. say();
    }

}
