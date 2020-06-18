package com.serpamedeiros;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.serpamedeiros")

public class ArithmeticNoAutoWired {
	private Basic basic;
	
	public ArithmeticNoAutoWired(Basic basic) {
		this.basic = basic;
	}

	int doAdd(int op1, int op2) {
		return basic.add(op1, op2);
	}

	public Basic getBasica() {
		return basic;
	}

	public void setBasica(Basic basic) {
		this.basic = basic;
	}

	public int doAdd() {
		return basic.add();
	}
}
