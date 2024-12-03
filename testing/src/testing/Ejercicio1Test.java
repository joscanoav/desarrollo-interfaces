package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio1Test {

	@Test
	public void pruebaDivision() {
		int resultado = Ejercio1.resultadoDivision(10,5);
		int esperado = 2;
		assertEquals(resultado,esperado);
	}

}
