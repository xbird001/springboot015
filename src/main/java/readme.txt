spring boot aop
	1、spring boot应用默认启动时就是开启的；
	2、加入pom.xml中加入jar包依赖，spring boot给我们提供了启动帮助
			<dependency>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-starter-aop</artifactId>
			</dependency>
	3、编写一个类，封装横切关注面对应的具体逻辑，并用@Aspect进行注解，然后在横切关注类中编写通知（Advice，分为前置通知、后置通知等等），
		并且纳入到spring容器中进行管理
	4、可以通过方法参数JoinPoint joinPoint拿到具体的连接点的信息，比如方法签名、方法参数、方法所属的类等信息
	5、具体参见类：springboot010.LogAspect.class的用法
	6、也可以通过@EnableAspectJAutoProxy开启aop，上面的方式二选其一，不用两者都用，不然会出问题

	