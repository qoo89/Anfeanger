package p_17122018;

import edu.bielefeld.io.EAM;
import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class String {

	public static void main(java.lang.String[] args) {
		
		String eingabe;
		int abbruch=0;
		do
		{
			StdOut.print("Zum beenden 'Ende' eingeben: ");
			eingabe = StdIn.readString();
			if (!eingabe.startsWith("End"))
			{
				StdOut.println("Weiter");
				
				
			}else
			{
				abbruch = 1;
				StdOut.println("Abbruch!!");
			}
			
		}while(abbruch == 1);

	}

	private boolean startsWith(java.lang.String string) {
		// TODO Auto-generated method stub
		return false;
	}

}
