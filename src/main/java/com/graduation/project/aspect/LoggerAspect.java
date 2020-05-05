package com.graduation.project.aspect;

//import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

import com.graduation.project.annotation.HibernateTransactional;;

@Aspect
@Component
public class LoggerAspect {
	
private static final Logger logger = LogManager.getLogger(LoggerAspect.class);
	
	@Around("@annotation(logger)")
	public Object execute(ProceedingJoinPoint proceedingJoinPoint, com.graduation.project.annotation.Logger logger) throws Throwable {
		

		//MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();
		
		 // if (!logger.active()) {
	      //      return proceedingJoinPoint.proceed();
	       // }
		
		String className =proceedingJoinPoint.getSignature().getDeclaringType().getSimpleName();
		String methodName = proceedingJoinPoint.getSignature().getName();
		
		StopWatch stopWatch = new StopWatch();
		
		stopWatch.start();
		
		/*
		LogTimeUnit timeUnit = logger.timeUnit();
		
		double time = 0;
		
		if(LogTimeUnit.MILLISECOND.equals(timeUnit)) {
			time = stopWatch.getTime(TimeUnit.MILLISECONDS);
		}
		else if(LogTimeUnit.SECOND.equals(timeUnit)) {
			time = stopWatch.getTime(TimeUnit.SECONDS);
		}
		
		LoggerAspect.logger.info(className + "#" + methodName + " executed in " + time + " " + timeUnit.toString());
		*/
		
		Object result;
        result = proceedingJoinPoint.proceed();

        stopWatch.stop();

        System.out.println("Class name =  " + className + "   " + "Function name =  " + methodName + " runned in  " + stopWatch.getTotalTimeMillis() + " ms");

        return result;
    }

}

