package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;

class TEST0014 {

	static Cuenta ctaPruebas;
	static Cuenta ctaPruebas1;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		ctaPruebas = new Cuenta(50,"alvaro", "12345");
		ctaPruebas1 = new Cuenta(0,"Alvaro", "67890");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testctaPruebas() {
		System.out.println("Cuenta "+ctaPruebas.getNumero());
		ctaPruebas.reintegro(200);
		ctaPruebas.ingresar(100);
		ctaPruebas.reintegro(200);
		assertEquals(-250, ctaPruebas.saldofinal());
		
		
	}
	@Test
	void testctaPruebas1() {
		System.out.println("\n Cuenta "+ctaPruebas1.getNumero());
		ctaPruebas1.reintegro(350);
		ctaPruebas1.reintegro(200);
		ctaPruebas1.ingresar(50);
		assertEquals(-450, ctaPruebas1.saldofinal());
		
	}

}
