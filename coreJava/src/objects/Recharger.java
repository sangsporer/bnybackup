package objects;

public class Recharger {
	
	String name;
	String commitID;
	String email;
	String buddyName;
	int javaKBAscore;
	String awsID;
	String bLine;
	
	public Recharger(String name, String commitID, int javaKBAscore) {
		this.name=name;
		this.commitID=commitID;
		this.javaKBAscore=javaKBAscore;
		
		// TODO Auto-generated constructor stub
	}
	
	//new constructor for instructor
	public Recharger(String name, String email, String awsID) {
		this.name=name;
		this.email=email;
		this.awsID=awsID;
		
		// TODO Auto-generated constructor stub
	}
	
	Recharger() {
		// TODO Auto-generated constructor stub	
	}
	
	int add(int x, int y) {
		return x+y;
	}
	
	int add(int x, int y, int z) {
		return x+y+z;
	}
	public void printMe() {
		System.out.println(name);
		System.out.println(commitID);
		System.out.println(email);
		System.out.println(buddyName);
		System.out.println(javaKBAscore);
		System.out.println(awsID);
		System.out.println(bLine);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Recharger vernon = new Recharger("Vernon", "ABCDEF", 100);
		vernon.buddyName = "Marco";
		
		vernon.printMe();
		
		Recharger claire = new Recharger("Claire", "BCDEFG", 100);
		
		Recharger[] pList = new Recharger[25];
		pList[0] = claire;
//		pList[1] = claire; //can have duplicate items in array
		pList[1] = vernon;
		
		Recharger ins1=new Recharger("Instructor1", "ins1@perscholas.org", "instructor1");
		
		for (int i=0; i<2;i++) {
			pList[i].printMe();
		}
		

	}

}
