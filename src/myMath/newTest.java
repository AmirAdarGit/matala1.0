/**
 * This class are used to test the program
 *@author Amir Adar and Ido Elmaliah 
 *@version 1.0
 *
 */
package myMath;
import java.util.Scanner;
public class newTest {
	public static void main(String[] args) throws Exception {
		
		try {
			int num = 0;	
			while(num<=10)
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("project number 1.0");
				System.out.println("---> 1: Monom Tester\n"+"---> else: Polynom Tester");

				num = sc.nextInt();
				if(num == 1) // MONOM TESTER
				{
					sc = new Scanner(System.in);
					System.out.println("Enter first Monom");
					String input_first_monom = sc.nextLine();
					Monom first_monom = new Monom(new String(input_first_monom));
					System.out.println("* ---->     Monom 1 is: ("+ first_monom +")");
					
					System.out.println("Enter second Monom");
					String input_second_monom = sc.nextLine();
					Monom second_monom = new Monom(new String(input_second_monom));
					System.out.println("* ---->     Monom 2 is: ("+ second_monom +")");
					
					System.out.print("Enter what function you want to try: \n"
							+ "2: add (Monom m1) \n"
							+ "3: derivative_Monom_1()\n"
							+ "4: multiply(Monom m1)\n"
							+ "5: f_Monom_1(x)\n"
							+ "   ---> PRESS OTHER KEY TO EXIT \n");
					

					num = sc.nextInt();
					System.out.println("* ----> RESULT FOR "+num+" BELOW  <----");
					System.out.println("* ---->     Monom 1 is: "+first_monom);
					System.out.println("* ---->     Monom 2 is: "+second_monom);

					Monom ans;
					switch(num) {

					case 2: 
						ans = new Monom(first_monom);
						ans.add(second_monom);
						System.out.println(ans+"\n");
						break;

					case 3:
						ans = new Monom(first_monom.derivative());
						System.out.println(ans+"\n");
						break;

					case 4: 
						ans = new Monom(first_monom);
						ans.multiply(second_monom);
						System.out.println(ans+"\n");
						break;

					case 5:
						System.out.println("Enter x");
						int x = sc.nextInt();
						System.out.println("f("+x+")= "+first_monom.f(x));
						break;
					default:
						num = 10;
						System.out.println("\n---> Program has finished");
						System.exit(0);
					}

				}
				else {
					sc = new Scanner(System.in);
					System.out.println("Enter First Polynom");
					String input_first_polynom = sc.nextLine();
					Polynom first_polynom = new Polynom(new String(input_first_polynom));
					System.out.println("* ---->     Polynom 1 is: ("+first_polynom+")");
					System.out.println("Enter Second Polynom");
					String input_second_polynom = sc.nextLine();
					Polynom second_polynom = new Polynom(new String(input_second_polynom));
					System.out.println("* ---->     Polynom 2 is: ("+second_polynom+")");
					
					System.out.print("Enter what function you want to try: \n"
							+ "2: add (Polynom p1) \n"
							+ "3: substract(Polynom p1)\n"
							+ "4: area of Polynom 1 ---- (positive side of x) (double x0,double x1, double eps)\n"
							+ "5: area of Polynom 1 ---- (negative side of x, update matala 1) (double x0,double x1, double eps)\n"
							+ "6: derivative Polynom 1()\n"
							+ "7: equals Polynom 1()\n"
							+ "8: isZero Polynom 1()\n"
							+ "9: multiply(Polynom p1)\n"
							+ "10: root Polynom 1(double x0,double x1, double eps)\n"
							+ "11: f Polynom 1(x)\n"
							+ "12: print the first polynom on graph between the borders: (double x0,double x1, double eps)\n"
							+ "   ---> PRESS OTHER KEY TO EXIT \n");

					num = sc.nextInt();
					System.out.println("* ----> RESULT FOR "+num+" BELOW  <----");
					System.out.println("* ---->     Polynom 1 is: "+first_polynom);
					System.out.println("* ---->     Polynom 2 is: "+second_polynom);

					switch(num) {

					case 2: 
						first_polynom.add(second_polynom);
						System.out.println(first_polynom+"\n");
						break;

					case 3:
						first_polynom.substract(second_polynom);
						System.out.println(first_polynom+"\n");
						break;

					case 4:
						try {
						sc = new Scanner(System.in);
						System.out.println("Enter x0,x1,eps (<----with comma exactly like it looks----)");
						String s = sc.nextLine();
						String[] values = s.split(",");
						System.out.println(first_polynom.area(Double.parseDouble(values[0]),Double.parseDouble(values[1]), Double.parseDouble(values[2]))+"\n");
						break;
						}
						catch(Exception e)
						{
							System.err.println("Wrong values");
							System.exit(1);
						}
						
					case 5:
						try {
							sc = new Scanner(System.in);
							System.out.println("Enter x0,x1,eps (<----with comma exactly like it looks----)");
							String s = sc.nextLine();
							String[] values = s.split(",");
							System.out.println(first_polynom.area_graph(Double.parseDouble(values[0]),Double.parseDouble(values[1]), Double.parseDouble(values[2]))+"\n");
							break;
							}
							catch(Exception e)
							{
								System.err.println("Wrong values");
								System.exit(1);
							}
						
					case 6: 
						System.out.println(first_polynom.derivative()+"\n");
						break;

					case 7:
						System.out.println(first_polynom.equals(second_polynom)+"\n");
						break;

					case 8:
						System.out.println(first_polynom.isZero()+"\n");
						break;

					case 9: 
						first_polynom.multiply(second_polynom);
						System.out.println(first_polynom+"\n");
						break;

					case 10:
						try {
							sc = new Scanner(System.in);
							System.out.println("Enter x0,x1,eps (<----with comma exactly like it looks----)");
							String s = sc.nextLine();
							String[] values = s.split(",");
							System.out.println(first_polynom.root(Double.parseDouble(values[0]),Double.parseDouble(values[1]), Double.parseDouble(values[2]))+"\n");
							break;
							}
							catch(Exception e)
							{
								System.err.println("Wrong values");
								System.exit(1);
							}
					case 11:
						System.out.println("Enter x");
						int x = sc.nextInt();
						System.out.println("f("+x+")= "+first_polynom.f(x));
						break;

					case 12:
						try {
							sc = new Scanner(System.in);
							System.out.println("Enter x0,x1,eps (<----with comma exactly like it looks----)");
							String s = sc.nextLine();
							String[] values = s.split(",");
							first_polynom.graph(Double.parseDouble(values[0]),Double.parseDouble(values[1]), Double.parseDouble(values[2]));
							System.err.println("In order to see the peak point's you need to zoom in the window!!!");
							break;
							}
							catch(Exception e)
							{
								System.err.println("Wrong values");
								System.exit(1);
							}
						
 					default:
						num=11;
						System.out.println("\n---> Program has finished");
						System.exit(0);
					}
				}
			}
		}
		catch(Exception e)
		{
			System.err.println("Catched Error from Test CLASS \n"+e.getMessage());
		}
	}
}