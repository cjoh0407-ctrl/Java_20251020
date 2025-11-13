package ExtendsEx2;

public class Friend extends Person{

	private String phoneNum;
	private String email;
	
	public Friend() {
	}

	public Friend(String name, String phoneNum, String email) {
		super(name);
		this.phoneNum = phoneNum;
		this.email = email;
	}
	
	public String getInfo() {
		return super.getInfo() + phoneNum + email;
	}
	
}
