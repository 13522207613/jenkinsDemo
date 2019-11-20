package cn.com.chinarailway.oa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class OaWebApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(OaWebApplication.class, args);
	}

}