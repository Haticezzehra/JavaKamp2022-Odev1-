
public class Main {

	public static void main(String [] args)
	{
		int sayi =1;
		int kalan=1;
		if(sayi==1)
		{
			System.out.println("Sayi asal degil");
			
		}
		else {
			
		
		for(int i=1;i<sayi;i++)
		{
			if(sayi%i==0)
			{
				kalan=0;
				break;
			}
		}
		
		if(kalan==0)
		{
			System.out.println("Sayi asal degil");
		}
		else
		{
			System.out.println("Sayi asal");
		}
		}
	}
}
