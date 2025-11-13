package ex07;

public class Member{
	private String name;
	private String id;
	private String password;
	private int age;
	
	public Member(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getpassword() {
		return password;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
}

