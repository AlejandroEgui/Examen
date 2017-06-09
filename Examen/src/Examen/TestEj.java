package Examen;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEj {
	@Test
	  public void valido1()
	  {
	    org.junit.Assert.assertEquals(300L, Ej3.Datos("100", "Diego Alvarez", "01", "SI"));
	  }
	  

	  @Test
	  public void valido2()
	  {
	    org.junit.Assert.assertEquals(500L, Ej3.Datos("101", "Alba Gomez", "07", "NO"));
	  }
	  

	  @Test(expected=Exception.class)
	  public void noValido1()
	  {
	    Ej3.Datos("000", "Jesus Garcia", "10", "SI");
	  }
	  

	  @Test(expected=Exception.class)
	  public void noValido2()
	  {
		  Ej3.Datos("1001", "Carmen Ruiz", "09", "NO");
	  }
	  

	  @Test(expected=Exception.class)
	  public void noValido3()
	  {
		  Ej3.Datos("abc", "Sandra Lopez", "02", "SI");
	  }
	  

	  @Test(expected=Exception.class)
	  public void noValido4()
	  {
		  Ej3.Datos("123", "Juan Gonzalez Fernandez", "03", "SI");
	  }
	  

	  @Test(expected=Exception.class)
	  public void noValido5()
	  {
		  Ej3.Datos("123", "Carmen Ruiz", "-1", "SI");
	  }
	  

	  @Test(expected=Exception.class)
	  public void noValido6()
	  {
		  Ej3.Datos("123", "Carmen Ruiz", "111", "NO");
	  }
	  

	  @Test(expected=Exception.class)
	  public void noValido7()
	  {
		  Ej3.Datos("123", "Carmen Ruiz", "ab", "NO");
	  }
	  

	  @Test(expected=Exception.class)
	  public void noValido8()
	  {
		  Ej3.Datos("123", "Carmen Ruiz", "08", "*");
	  }

}
