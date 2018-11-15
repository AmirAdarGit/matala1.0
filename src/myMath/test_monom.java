package myMath;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import myMath.Monom;
	class test_monom {
	
		@Test
		public void test_String_constractor_equal() 
		{
			Monom p1= new Monom("2x^2");
			String str ="2.0x^2";
			assertEquals(str.toString(),p1.toString());
		}
		
		@Test
		public void test_String_constractor_not_equal() 
		{
			Monom p1= new Monom("2x^10");
			String str ="2.0x^2";
			assertNotEquals(str.toString(),p1.toString());
		}
		
		@Test
		public void test_copy_constractor_equal() 
		{
			Monom p1= new Monom("2x^2");
			Monom p2= new Monom(p1);
			assertEquals(p1.toString(),p2.toString());
		}
		@Test
		public void test_difolt_constractor_equal() 
		{
			Monom p1= new Monom();
			String str ="0.0x^0";
 			assertEquals(str.toString(),p1.toString());
		}
		@Test
		public void test_difolt_constractor_not_equal() 
		{
			Monom p1= new Monom();
			String str ="0.1";
			assertNotEquals(str.toString(),p1.toString());
		}
		@Test
		public void test_constractor_equal() 
		{
			Monom p1= new Monom(3,4);
			String str ="3.0x^4";
			assertEquals(str.toString(),p1.toString());
		}
		@Test
		public void test_constractor_not_equal() 
		{
			Monom p1= new Monom(3,10);
			String str ="3.0x^4";
			assertNotEquals(str.toString(),p1.toString());
		}
		@Test
		void test_add_equal() {
			Monom m1= new Monom(2,2);
			Monom m2= new Monom(3,2);
			Monom m3= new Monom(5,2);
			try{
				m1.add(m2);
				assertEquals(m3.toString(), m1.toString());
			}
			catch(Exception e) 
			{
				System.out.println("error input, enter new monoms and try again");
			}
		}
		@Test
		void test_add_not_equal() {
			Monom m1= new Monom(2,2);
			Monom m2= new Monom(3,2);
			Monom m3= new Monom(4,2);//givven wronn resolte
			try{
				m1.add(m2);
				assertNotEquals(m3.toString(), m1.toString());
			}
			catch(Exception e) 
			{
				System.out.println("error input, enter new monoms and try again");
			}
		}

		@Test
		void test_substract_equal() {
			Monom m1= new Monom(10,2);
			Monom m2= new Monom(5,2);
			Monom m3= new Monom(5,2);
			try{
				m1.substract(m2);
	 			assertEquals(m3.toString(), m1.toString());
			}
			catch(Exception e) 
			{
				System.out.println("error input, enter new monoms and try again");
			}
		}
		@Test
		void test_substract_not_equal() {
			Monom m1= new Monom(20,2);//givven wronn resolte
			Monom m2= new Monom(5,2);
			Monom m3= new Monom(5,2);
			try{
				m1.substract(m2);
	 			assertNotEquals(m3.toString(), m1.toString());
			}
			catch(Exception e) 
			{
				System.out.println("error input, enter new monoms and try again");
			}
		}
		
		@Test
		void test_multiply_equal() {//same logic in "multiplyMonom" and "multiplyHelper" function (multiply)
			Monom m1= new Monom(10,2);
			Monom m2= new Monom(5,2);
			Monom m3= new Monom(50,4);
		 
				m1.multiply(m2);
	 			assertEquals(m3.toString(), m1.toString());
		}
		
		@Test
		void test_multiply_not_equal() {
			Monom m1= new Monom(10,2);
			Monom m2= new Monom(5,2);
			Monom m3= new Monom(10,4);//givven wronn resolte
		 
				m1.multiply(m2);
	 			assertNotEquals(m3.toString(), m1.toString());
		}
		
		@Test
		void test_toString_equal() {
			Monom m1= new Monom(10,2);	 
	  			assertEquals("10.0x^2", m1.toString());
		}
		@Test
		void test_toString_not_equal() {
			Monom m1= new Monom(10,2);	 
	  			assertNotEquals("-10.0x^2", m1.toString());//givven wronn resolte
		}
		
		@Test
		void test_isEqual_equal() {
			Monom m1= new Monom(10,2);
			Monom m2= new Monom(10,2);
	 	 
	  			assertTrue(m1.isEqual(m2));
		}
		@Test
		void test_isEqual_not_equal() {
			Monom m1= new Monom(20,2);
			Monom m2= new Monom(10,2);
	 	 
	  			assertFalse(m1.isEqual(m2));
		}
		@Test
		void testF_equals() {
			Monom m1= new Monom(2,2);
			double actual =m1.f(3);
			double expected =2*Math.pow(3, 2);
			assertTrue(expected==actual);
		}

		@Test
		void testF_not_equals() {
			Monom m1= new Monom(2,2);
			double actual =m1.f(3);
			double expected =3*Math.pow(3, 2);//chang to 3
			assertNotEquals(expected, actual);
		}
		@Test
		void test_derivative_equals() {
			Monom m1= new Monom(2,2);
			Monom derivativ =m1.derivative();
			System.out.println(derivativ.toString());
 			assertEquals("4.0x^1",derivativ.toString());
		}

		@Test
		void test_derivative_not_equals() {
			Monom m1= new Monom(2,2);
			Monom derivativ =m1.derivative();
			System.out.println(derivativ.toString());
			assertNotEquals("4.0x^23",derivativ.toString());
		}
	}