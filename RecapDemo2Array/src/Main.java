
public class Main {
public static void main(String[]args)
{
	double[] myList= {3.5,6.7,5.6,2.3};
	double total=0;
	double max=myList[0];
	for(double number:myList)
	{
		System.out.println(number);
		total=total+number;
		if(number>max)
		{
			max=number;
		}
	}
	System.out.println("Enbuyuk:"+max);
	System.out.println("Toplam:"+total);
}
} 
