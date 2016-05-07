import static org.junit.Assert.*;

import org.junit.Test;

public class ConversorNumerosRomanosTest {
	ConversorNumerosRomanos c = new ConversorNumerosRomanos();
	int n;
	@Test
	public void testI() {
		 n = c.convertir("I");
		assertEquals(1,n);
	}
	@Test
	public void testV() {
		 n = c.convertir("V");
		assertEquals(5,n);
	}
	@Test
	public void testL() {
		ConversorNumerosRomanos c = new ConversorNumerosRomanos();
		n = c.convertir("L");
		assertEquals(50,n);
	}
	@Test
	public void testXXV() {
		ConversorNumerosRomanos c = new ConversorNumerosRomanos();
		n = c.convertir("XXV");
		assertEquals(25,n);
	}
	@Test
	public void testLXIV() {
		ConversorNumerosRomanos c = new ConversorNumerosRomanos();
		n = c.convertir("LXIV");
		assertEquals(64,n);
	}
	@Test
	public void testDLXXIX() {
		ConversorNumerosRomanos c = new ConversorNumerosRomanos();
		n = c.convertir("DLXXIX");
		assertEquals(579,n);
	}
	@Test
	public void testCMXCVII() {
		ConversorNumerosRomanos c = new ConversorNumerosRomanos();
		n = c.convertir("CMXCVII");
		assertEquals(997,n);
	}
	@Test
	public void testM() {
		ConversorNumerosRomanos c = new ConversorNumerosRomanos();
		n = c.convertir("M");
		assertEquals(1000,n);
	}
}
