package histogram;

import java.io.IOException;

public class HistogramRunner
{
	public static void main( String args[] ) throws IOException
	{
		Histogram test = new Histogram("a b c d e f g h i a c d e g h i h k");
		test.print();
		System.out.println("\n\n");

		test = new Histogram("1 2 3 4 5 6 1 2 3 4 5 1 3 1 2 3 4");
		test.print();
		System.out.println("\n\n");

		test = new Histogram("Y U I O Q W E R T Y");
		test.print();
		System.out.println("\n\n");

		test = new Histogram("4 T # @ ^ # # #");
		test.print();
		
	}
}