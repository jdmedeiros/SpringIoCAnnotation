package com.serpamedeiros;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		try (ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(ArithmeticNoAutoWired.class)) {
			ArithmeticNoAutoWired arithmetic = context.getBean(ArithmeticNoAutoWired.class);
			System.out.println(arithmetic.doAdd(10, 20));
			arithmetic.getBasica().setOp1(100);
			arithmetic.getBasica().setOp1(200);
			System.out.println(arithmetic.doAdd());
		}
		try (ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(ArithmeticAutoWired.class)) {
			ArithmeticAutoWired arithmetic = context.getBean(ArithmeticAutoWired.class);
			System.out.println(arithmetic.doAdd(30, 40));
			arithmetic.getBasica().setOp1(300);
			arithmetic.getBasica().setOp1(400);
			System.out.println(arithmetic.doAdd());
		}
	}
}
