package com.ejemplo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class AppTest {
	@Test
	public void testApp() {
		assertTrue(true);
	}

	 @Test
	    public void testMainMethod() {
	        // Redirigir la salida estándar a un ByteArrayOutputStream para capturarla
	        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	        System.setOut(new PrintStream(outContent));

	        // Llamar al método main de la clase App
	        App.main(new String[]{});

	        // Restaurar la salida estándar
	        System.setOut(System.out);

	    }
}