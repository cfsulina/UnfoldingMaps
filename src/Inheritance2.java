 class P1{
	public void method1(){
		System.out.println("Person1");
	}
	public void method2(){
		System.out.println("Person2");
	}
}
class P2 extends P1{
	public void method1(){
		System.out.println("Student1");
		super.method1();
		this.method2();
	}
	public void method2(){
		System.out.println("Studen2");
	}
}
class P3 extends P2{
	public void method2(){
		System.out.println("undergrad2");
	}
	public void method3(){
		System.out.println("u3");
	}
}

public class Inheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     P1 u=new P3();
     u.method1();
	}

}
