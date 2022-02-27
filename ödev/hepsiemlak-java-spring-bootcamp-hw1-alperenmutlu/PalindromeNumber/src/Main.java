import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
	
    int max = 0;
    int sonuc = 0;
    List<Integer> results = new ArrayList<Integer>();
    List<Integer> results2 = new ArrayList<Integer>();
	for(int i = 10; i<=100; i++) {
		if(i == 89 || i == 98)
			continue;
		sonuc = adimSayisi(i);
		
		if(sonuc > max)
		{
			max = sonuc;
			results.add(i);
			results2.add(sonuc);
		}				
		
	}
	
	
	Integer max1 = Collections.max(results);
	Integer max2 = Collections.max(results2);
	
	
	System.out.println("EN UZUN ZÝNCÝR " + max1 + " SAYISI ÝÇÝN : " + max2 + " DIR!" );
	
	System.out.println("");
	System.out.println("98 VE 89 SAYILARI ÝÞLEME DAHÝL EDÝLMEMÝÞTÝR, uygulama stackoverflow hatasý veriyor. ");

	}
	
	
    public static int sayininTersi(int sayi)
    {

       
    	int toplam = 0;
       
    	int kalan = 0;
       
    	int tersi = 0;

    	tersi = sayi;
        while (tersi > 0)
        {
        	kalan = tersi % 10;
            toplam = (toplam * 10) + kalan;
            tersi = tersi / 10;
        }

        return toplam;

    }
	
    static public int adimSayisi(int sayi)
    {
        int adimSayisi = 0;
        int toplam = sayi + sayininTersi(sayi);
       
        while(toplam != sayininTersi(toplam))
        {
            adimSayisi++;
            toplam = toplam + sayininTersi(toplam);
            
        }
        adimSayisi++;
        return adimSayisi;     
    } 


}
