package com.my_day_data_service;

import com.my_day_data_service.service.insight.InsightService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class MyDayDataServiceApplication {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(MyDayDataServiceApplication.class)) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean(InsightService.class).findInsight());
		}
	}
}
