
public class Main {

	
	public static void main(String[] args) {
		//Temel olarak JAVA �oklu kal�t�m� desteklemez.
		
	}
	
//	class A{
//		 //Bu �ekilde bir kullan�m m�mk�n de�ildir.Bu tarz durumlarda interface'i
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
	//Burada �rnek verecek olursak; B ve C s�n�flar� A s�n�f�ndaki bir metodu override etsin.
	//Peki b�yle bir durumda D s�n�f� A s�n�f�ndaki ayn� method�u override etmeden kullanmaya 
	//�al���rsa ne olur?
	//B�nin override�� m� C�nin override�� m� �al���r? 
	//��te burada bir problem ortaya ��kar. Ad�na diamond problem denir.
//	}
	
	
	
	

	//�oklu kal�t�m� destekleyen C++, Perl, Python, Lisp gibi diller destekler.
	
	
	//Javada �oklu kal�t�m� interfaceler ile ger�ekle�tirebiliyoruz dedik, peki nas�l?
	
	
	interface A{
		void sum();
	}
	
	interface B{
		void add();
	}
	
	class C implements A,B{

		
	//A ve B interfacelerindeki metotlar� override ederek C s�n�f� kullanabilir.
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
