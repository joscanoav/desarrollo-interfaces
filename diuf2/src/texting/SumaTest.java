package texting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumaTest {

	@Test
	public void pruebaSuma() {
		int resultado = Suma.resultadoSuma(7, 11);
		int esperado =18;
		
		assertEquals(esperado, resultado);
	}
	

}
