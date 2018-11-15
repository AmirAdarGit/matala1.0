package myMath;

import java.io.IOException;

import org.knowm.xchart.BitmapEncoder;
import org.knowm.xchart.QuickChart;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYChart;
import org.knowm.xchart.BitmapEncoder.BitmapFormat;
public class my_graph{


	public static void graph(double start, double end, double eps ,Polynom poly) throws IOException
	{

		double dis=((end-start)/eps)+1;

		double[] xData = new double[(int)dis];
		double[] yData = new double[(int)dis] ;
		for(int i=0;i<dis;i++)
		{
			yData[i]=poly.f(i*eps+start);
			xData[i]=i*eps+start;
			double r=poly.f(i);
		}


		XYChart chart = QuickChart.getChart("Sample Chart", "X", "Y", "y(x)", xData, yData);

		// Show it
		new SwingWrapper(chart).displayChart();

		// Save it
		BitmapEncoder.saveBitmap(chart, "./Sample_Chart", BitmapFormat.PNG);

		// or save it in high-res
		BitmapEncoder.saveBitmapWithDPI(chart, "./Sample_Chart_300_DPI", BitmapFormat.PNG, 300);
	}
	public void erea(Polynom poly, double x0,double x1,double eps)
	{
		double dis=((x0-x1)/eps)+1;
		//
		//		double[] xData = new double[(int)dis];
		//		double[] yData = new double[(int)dis] ;
		Polynom temp = new Polynom(poly);
		temp.derivative();
		for(int i=0;i<dis;i++)
		{
			if(temp.f(i*eps+x0)*temp.f(i*eps+x0+eps)<0)
			{
				System.out.println(temp.f(i*eps+x0));
			}
				
//				yData[i]=poly.f(i*eps+x0);
//			xData[i]=i*eps+x1;
//			double r=poly.f(i);
		}

	}
}