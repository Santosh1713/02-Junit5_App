package com.ashokit.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.ashokit.beans.Calculator;

public class CalculatorTest {
	
	@Test
	public void testadd() {
		
		Calculator cal=new Calculator();
		Integer actual = cal.add(10, 5);
		Integer expected=15;
		assertEquals(expected, actual);
	}

}
