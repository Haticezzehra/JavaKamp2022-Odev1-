
public class Main {
public static void main(String[] args)
{
	int[] sayilar= {1,2,5,7,9,0};
	int aranacak =5;
	boolean	varMi=false;
	for(int sayi:sayilar)
	{
		if(sayi==aranacak)
		{
			varMi=true;
		}
	}
	if(varMi==true)
	{
		System.out.println("Aranacak sayi dizide var.");
	}
	else
	{
		System.out.println("Aranacak sayi dizide yok.");	
	}
}
}
