package superkeyword;

public class Demo extends Superex {
	int a=7;
	void drinking() {
		System.out.println("tea");
	}
	void displat() {
		System.out.println(a);
		System.out.println(super.a);
		drinking();
		super.drinking();
	}
	Demo(){
		super();
	}
	public static void main(String[] args) {
		Demo d=new Demo();
	    d.displat();
	}
	

}
