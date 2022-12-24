package com.checha.calculador;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadorApplicationTests {
	private Calculador calculator = new Calculador();

	@Test
	public void testSum() {
		assertEquals(5, calculator.sum(2, 3));
	}
}

