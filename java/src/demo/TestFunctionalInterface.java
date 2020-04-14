package demo;

@FunctionalInterface
interface Square{
	public int calculate(int x);
	static void hello(int y){
		System.out.println("interface static");
	}
}


public class TestFunctionalInterface {

	static void hello(){
		System.out.println("Class static method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =5;
		final Square s=x->x*x;
		int ans = s.calculate(a);
		System.out.println(ans);
		Square.hello(a);
		hello();
	}

}