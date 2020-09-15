package tdoo.demo.aop.srevice.impl;

import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Service;
import tdoo.demo.aop.AopProxy;
import tdoo.demo.aop.EnableAop;
import tdoo.demo.aop.srevice.AopService;


@Service
public class AopServiceImpl implements AopService, AopProxy {


    @EnableAop
    @Override
    public void say() {

        System.out.println(AopContext.currentProxy());
        System.out.println("------------------------------------------------");
    }
}
