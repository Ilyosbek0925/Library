package spring.librarian.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class ProcessingAspect {
    private static final Logger logger = Logger.getLogger(ProcessingAspect.class.getName());

    @Around("execution(* spring.librarian.service.BookService.*(..))")
    public Object processTimeOfAnyMethod(ProceedingJoinPoint pjp) throws Throwable {
        int start = (int) System.currentTimeMillis();
        Object proceed = pjp.proceed();
        long delta = System.currentTimeMillis() - start;

        logger.info(delta/1000 + " s to execute " + pjp.getSignature().getName() + " method");
        return proceed;
    }
}
