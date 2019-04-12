package oops;

public class MainMethod {

	public MainMethod() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Monster m1 = new FireMonster("r2u2"); // upcasting
		Monster m2 = new WaterMonster("u2r2");
		Monster m3 = new StoneMonster("r2r2");
		
		System.out.println(m1.attack());
		System.out.println(m2.attack());
		System.out.println(m3.attack());

		m1 = new StoneMonster("a2h2");
		System.out.println(m1.attack());
		
		Monster m4 = new Monster("u2u2");
		System.out.println(m4.attack());
		
		FireMonster f1 = new FireMonster("r2u2");
		
		f1 = (FireMonster)m4; // down casting
		
		
		

	}

}
