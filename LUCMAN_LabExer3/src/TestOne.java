public class TestOne {
	//private data members
	private long acc_no;
	private String name;
	private String email;
	private float amount;
	
	//construct a this constructor
	public TestOne(String email, String name,long acc_no, float amount) {
		this.email = email;
		this.name = name;
		this.acc_no = acc_no;
		this.amount = amount;
		}
	
	//public getter methods
	public String getemail() {
		return email;
		}
	public String getName() {
		return name;
		}
	public long getacc_no() {
		return acc_no;
		}
	
	public float getamount() {
		return amount;
		}
	
	//public setter methods
	public void setEmail(String email) {
		this.email = email;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAcc_no(long acc_no) {
		this.acc_no = acc_no;
	}
	
	public void setAmount(float amount) {
		this.amount = amount;
	}
	
}