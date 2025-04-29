package spring.librarian.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.LogManager;

@Aspect
@Component
public class LoggerAspect {
    public static final Logger logger = LoggerFactory.getLogger(LoggerAspect.class);
    static{
        try {
            LogManager.getLogManager().readConfiguration(new FileInputStream("src/main/java/spring/librarian/logging.properties"));
        } catch (IOException e) {
            throw new RuntimeException("something went really wrong \n\n\n"+e);
        }


    }
//return-type class-name.method-name(arg)
    @Before("execution(* spring.librarian.service.BookService.findAllBooks(..))||execution(* spring.librarian.service.BookService.updateBook(..))")
    public void after() {
        logger.info("this method is working\n\n\n");
    }


}
