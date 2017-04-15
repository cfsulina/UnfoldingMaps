
class A{
	public String show (D d){
		return ("A and D");
	}
	public String show(A a){
		return ("A and A");
	}
	
}
class B extends A{
	public String show (B b){
		return ("B and B");
	}
	public String show(A a){
		return ("B and A");
	}
}
class C extends B{}
class D extends B{}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   A a1=new A();
   A a2=new B();
   B b=new B();
   C c=new C();
   D d=new D();
   System.out.println(a2.show(b));
   }

}

//step1: 看this，并且只能看与super override的method
//step2: 看super，
//step3:this.show(super());
//step4:super.show(super());
