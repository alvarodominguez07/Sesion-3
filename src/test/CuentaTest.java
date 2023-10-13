package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;
import pkg.Movimiento;

class CuentaTest {

	static Cuenta ctaPruebas;
	static Cuenta ctaPruebas1;
	static Cuenta mia;
	static Movimiento e;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		mia = new Cuenta (100,"Alvaro", "34876");
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		mia.setSaldo(100);
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIngresar() {
		
		mia.ingresar(3000);
		assertEquals(3100, mia.getSaldo());
	}
	@Test
	void testRetirar() {
		mia.reintegro(1000);
		assertEquals(-900, mia.getSaldo());
		
	}
}