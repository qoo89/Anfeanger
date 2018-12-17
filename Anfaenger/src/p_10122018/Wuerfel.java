package p_10122018;

public class Wuerfel {

	private int augen;
	
	public Wuerfel() //Konstruktor
	{
		augen=0;
					
	}
	
	public int wurf()
	{
		this.augen = (int) (Math.random() * 6 + 1);
		return augen;
	}
	
	public int getAugen()
	{
		
		if(augen != 0)
		{
			return augen;
		}else
		{
			return wurf();
		}
	}
	
	public String toString()
	{
		return this.augen+":";
	}
	

}
