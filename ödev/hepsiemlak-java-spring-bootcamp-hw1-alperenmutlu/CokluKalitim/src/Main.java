
public class Main {

	
	public static void main(String[] args) {
		//Temel olarak JAVA çoklu kalýtýmý desteklemez.
		
	}
	
//	class A{
//		 //Bu þekilde bir kullaným mümkün deðildir.Bu tarz durumlarda interface'i
	      //kullanabiliriz.
//	}
//	
//	class B extends A {
//		
//	}
	
	//class C extends A{
		
	//}
//	
//	class D extends B, C{
//		
	//Burada örnek verecek olursak; B ve C sýnýflarý A sýnýfýndaki bir metodu override etsin.
	//Peki böyle bir durumda D sýnýfý A sýnýfýndaki ayný method’u override etmeden kullanmaya 
	//çalýþýrsa ne olur?
	//B’nin override’ý mý C’nin override’ý mý çalýþýr? 
	//Ýþte burada bir problem ortaya çýkar. Adýna diamond problem denir.
//	}
	
	
	
	

	//Çoklu kalýtýmý destekleyen C++, Perl, Python, Lisp gibi diller destekler.
	
	
	//Javada Çoklu kalýtýmý interfaceler ile gerçekleþtirebiliyoruz dedik, peki nasýl?
	
	
	interface A{
		void sum();
	}
	
	interface B{
		void add();
	}
	
	class C implements A,B{

		
	//A ve B interfacelerindeki metotlarý override ederek C sýnýfý kullanabilir.
		@Override
		public void add() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void sum() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
