
public class Main {
public static void main(String[] args)
{
	String mesaj="Bugun hava cok guzel    ";//Stringler karakter dizisidir.
	System.out.println(mesaj);
	System.out.println("Eleman sayisi:"+mesaj.length());
	System.out.println("5. Eleman:"+mesaj.charAt(4));
	System.out.println(mesaj.concat(" Yasasin"));
	System.out.println(mesaj.startsWith("B"));//B ile basliyomu
	System.out.println(mesaj.endsWith("b"));
	char[] karakterler=new char[5];
	mesaj.getChars(0, 4,karakterler,0);
	System.out.println(karakterler);
	System.out.println(mesaj.indexOf("B"));
	System.out.println(mesaj.lastIndexOf("e"));//sondan aramaya başlar ama baştan index sayısını dondurur.
	System.out.println(mesaj.replace(' ','-'));
	System.out.println(mesaj.substring(3,9));
	System.out.println(mesaj.split(" "));
	
	for (String kelime:	mesaj.split(" "))
	{
		System.out.println(kelime);
	}
	
	System.out.println(mesaj.toLowerCase());
	System.out.println(mesaj.toUpperCase());
	System.out.println(mesaj.trim());
}
}
