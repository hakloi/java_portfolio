package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication /* составная аннотация, объединяющая три другие
аннотации @SpringBootConfiguration , @EnableAutoConfiguration , @ComponentScan
*/
public class Starter {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		List<WebPage> webPages = new ArrayList<>();
		webPages.add(context.getBean("headerAboutUs", AboutUs.class));
		webPages.add(context.getBean("headerHomePage", HomePage.class));
		webPages.add(context.getBean("headerIndieGame", IndieGamesPage.class));

		User user = new User(webPages);
		user.readAllPages();

		context.close();
	}

}
