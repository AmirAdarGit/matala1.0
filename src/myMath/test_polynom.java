package myMath;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class test_polynom {

	@Test
	public void test_String_copy_constractor_equal() 
	{
		Polynom p1= new Polynom("2x^2+3x^4+3x+2");
		Polynom p2= new Polynom(p1);
		assertEquals(p2.toString(),p1.toString());
	}
	@Test
	public void test_String_constractor_equal() 
	{
		Polynom p1= new Polynom("2x^2+3x^4+3x+2");
		String str ="3.0x^4 +2.0x^2 +3.0x^1 +2.0x^0";
		assertEquals(str.toString(),p1.toString());
	}
	@Test
	public void test_String_constractor_not_equal() 
	{
		Polynom p1= new Polynom("2x^10+3x^4+3x+2");//diferent polynom
		String str ="3.0x^4 +2.0x^2 +3.0x^1 +2.0x^0";
		assertNotEquals(str.toString(),p1.toString());
	}
	@Test
	public void test_difolt_constractor_equal() 
	{
		Polynom p1= new Polynom();
		String str ="0";
		assertEquals(str.toString(),p1.toString());
	}
	@Test
	public void test_difolt_constractor_equal_not() 
	{
		Polynom p1= new Polynom();
		String str ="0.0";
		assertNotEquals(str.toString(),p1.toString());
	}
	@Test
	public void test_constractor_equal() 
	{
		Polynom p1= new Polynom("2x^2+3x^4+3x+2");
		String str ="3.0x^4 +2.0x^2 +3.0x^1 +2.0x^0";
		assertEquals(str.toString(),p1.toString());
	}


	@Test
	public void Test_add_equal ()
	{
		Polynom p1= new Polynom("2x^2+3x^4+3x+2");
		Polynom p2= new Polynom("4x^7+23x^4+9x+2");
		p1.add(p2);
		assertEquals(p1.toString(),"4.0x^7 +26.0x^4 +2.0x^2 +12.0x^1 +4.0x^0");
	}
	@Test
	public void Test_add_not_equal ()
	{
		Polynom p1= new Polynom("2x^2+3x^4+3x+2+2");
		Polynom p2= new Polynom("4x^7+23x^4+9x+2");
		p1.add(p2);
		assertNotEquals(p1.toString(),"4.0x^7 +26.0x^4 +2.0x^2 +12.0x^1 +4.0x^0");
	}
	@Test
	public void Test_substract_equal()
	{
		Polynom p1= new Polynom("2x^2+4x^5");
		Polynom p2= new Polynom("4x^2+2x^5");		
		p1.substract(p2);
		assertEquals("2.0x^5 +-2.0x^2",p1.toString());
	}

	@Test
	public void Test_substract_not_equal()
	{
		Polynom p1= new Polynom("2x^2+4x^10");
		Polynom p2= new Polynom("4x^2+2x^5");		
		p1.substract(p2);
		assertNotEquals("2.0x^5 +-2.0x^2",p1.toString());
	}

	@Test
	public void Test_multiply_equal()
	{
		Polynom p1= new Polynom("2x^2+3x");
		Polynom p2= new Polynom("2x^5+5x");
		p1.multiply(p2);
		assertEquals("4.0x^7 +6.0x^6 +10.0x^3 +15.0x^2", p1.toString());
	}
	@Test
	public void Test_multiply_not_equal()
	{
		Polynom p1= new Polynom("2x^2+3x^4");
		Polynom p2= new Polynom("2x^5+5x");
		p1.multiply(p2);
		assertNotEquals("4.0x^7 +6.0x^6 +10.0x^3 +15.0x^2", p1.toString());
	}

	@Test
	public void Test_area_equal()
	{
		Polynom p1 = new Polynom("-x^2+4") ;
		p1.area(-4, 0, 0.001);
		assertEquals("-1.0x^2 +4.0x^0", p1.toString());
	}
	@Test
	public void Test_area_not_equal()
	{
		Polynom p1 = new Polynom("-x^2+4+2") ;
		p1.area(-4, 0, 0.001);
		assertNotEquals("-1.0x^2 +4.0x^0", p1.toString());
	}
	@Test
	public void Test_root_equal()
	{
		Polynom p1 = new Polynom("x^2-10") ;
		p1.root(-4 , 0 , 0.001);
		assertEquals("1.0x^2 +-10.0x^0", p1.toString());
	}
	@Test
	public void Test_root_not_equal()
	{
		Polynom p1 = new Polynom("x^2-10-1000") ;
		p1.root(-4 , 0 , 0.001);
		assertNotEquals("1.0x^2 +-10.0x^0", p1.toString());
	}

	@Test
	public void Test_derivative_equal()
	{
		Polynom p = new Polynom("2x^6+3x^2+x^4") ;
		p.derivative() ;
 		assertEquals("12.0x^5 +4.0x^3 +6.0x^1", p.toString());
	}
	@Test
	public void Test_derivative_not_equal()
	{
		Polynom p = new Polynom("2x^6+3x^2+x^4-222x") ;
		p.derivative();
 		assertNotEquals("12.0x^5 +4.0x^3 +6.0x^1", p.toString());
	}
	@Test
	public void Test_area_graph_equal()
	{
		Polynom p1 = new Polynom("0.2x^4-1.5x^3+3.0x^2-x-5") ;
 		assertTrue(22.174402511579935==p1.area_graph(-2, 6, 0.01));
	}
	@Test
	public void Test_area_graph_not_equal()
	{
		Polynom p1 = new Polynom("0.2x^4-1.5x^3+3.0x^2-x-5") ;
 		assertFalse(30==p1.area_graph(-2, 6, 0.01));
	}
	
	
}