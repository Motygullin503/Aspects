package myproject.aspects;


import myproject.entities.Method;
import myproject.repositories.MethodsRepository;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;

@Aspect
@Component
    public class LogWork {

    @Autowired
    private MethodsRepository repository;

    @Before("@annotation(myproject.aspects.InvocationLogged) && execution(* *(..))")
    public void advice(JoinPoint jp) {

        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String args= "";

        for (Object o:jp.getArgs() ){
            args = args + o.toString();
        }

        Method method = new Method(jp.getSignature().getName(), args, timestamp);

        repository.save(method);
    }
}
