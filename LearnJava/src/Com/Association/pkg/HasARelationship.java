package Com.Association.pkg;

public class HasARelationship {
	public static void main(String[]args) {
//		A a = new A();
//		a.b.m();
//		a.n();
		A.b.m();
	}

}
class A{
	//B b = new B();//field>instance variable
	static B b = new B();//field>Static variable
	void n() {
		System.out.println("We all are learning python ");
	}
	
}
class B{
	void m() {
		System.out.println("We all are learning java");
	}
}
