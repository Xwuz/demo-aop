package tdoo.demo.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TestAspectj {



    @Pointcut("this(tdoo.demo.aop.AopProxy)")
    public void pointcut() {

    }


    @Before("pointcut()")
    public void before(JoinPoint joinPoint) {
        System.out.println("-----------------------------------------1");
    }

}
