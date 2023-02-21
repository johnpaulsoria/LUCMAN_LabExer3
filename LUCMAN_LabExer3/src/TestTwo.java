//A Java class to test the encapsulated class Account.
public class TestTwo {
	public static void main(String[] args) {
		//creating instance of Account class
		TestOne acc = new TestOne("sonoojaiswal@javatpoint.com", "Sonoo Jaiswal", 7560504000L, 500000f);
		
		//print the results
		System.out.print(acc.getacc_no() + " " + acc.getName() + " " + acc.getemail() + " " + acc.getamount());
	}
}