package springboot010;

import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication(exclude={ErrorMvcAutoConfiguration.class})
@EnableAspectJAutoProxy
public class App {
	
	public static void main(String[] args) throws SQLException {
		
		ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
		System.out.println(context.getBean(IUserDao.class).getClass());
		context.getBean(IUserDao.class).createUser("root", "root123");
		
	}

}
