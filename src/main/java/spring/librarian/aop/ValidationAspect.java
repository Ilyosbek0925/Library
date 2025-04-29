package spring.librarian.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;


@Aspect
@Component
public class ValidationAspect {
    private static final Logger logger = Logger.getLogger(ValidationAspect.class.getName());

    @Around("execution( * spring.librarian.service.BookService.findBookById())&&(args(id))")
    public Object validateAndUpdate(ProceedingJoinPoint joinPoint, Long id) throws Throwable {
        if (id < 0) {
            id = -id;
            logger.info("arg is updated\n\n");
        }
        Object proceed = joinPoint.proceed(new Object[]{id});
        return proceed;

    }
}
