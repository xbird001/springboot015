package springboot010;

import java.util.Arrays;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {
	
	@Before("execution(* springboot010..*.*(..))")
	public void preDoLog() {
		System.out.println("===============LogAspect.preDoLog=======================");
	}
	
	@After("execution(* springboot010..*.*(..))")
	public void postDoLog(JoinPoint joinPoint) {
		System.out.println("===============LogAspect.postDoLog=======================");
		System.out.println(joinPoint.getSignature().getName() + " " + joinPoint.getTarget().getClass() + " " + Arrays.asList(joinPoint.getArgs()));
		
	}
	
}
