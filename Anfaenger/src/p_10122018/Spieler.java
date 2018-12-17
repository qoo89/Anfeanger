package p_10122018;

import edu.princeton.cs.introcs.StdOut;

public class Spieler {
	
	 private String name;
	private Wuerfel [] wuerfeSpeicher; 						//InstanzArray

	public Spieler(String name) 							//Konstruktor
	{
		wuerfeSpeicher = new Wuerfel[3]; 					//initialisieren des Array´s
		
		this.name=name;
		
		for(int i=0; i<wuerfeSpeicher.length; i++)
		{
			wuerfeSpeicher[i] = new Wuerfel();				//Aufruf Konstruktor erstelle neues Objekt Wuerfel
		}
			
	}


	public String getName()
	{
		return this.name;
	}
	
	
	public Wuerfel[] wuerfeSpeicher()
	{
		return this.wuerfeSpeicher;
	}
	

	public int zeigeErgebnis(int augen)
	{
		int summeErgebnis=0;
		
		StdOut.println("Spieler: ");
		for(int i=0; i<wuerfeSpeicher.length;i++)
		{
			StdOut.println("Augenzahl Wuerfel"+(i+1)+": "+wuerfeSpeicher[i]);
			
			summeErgebnis = summeErgebnis + wuerfeSpeicher[i];
			
		}
		StdOut.println("Gesamtergebnis: "+summeErgebnis);
		
		return summeErgebnis;
	}
	
	
}
