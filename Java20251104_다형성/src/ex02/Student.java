package ex02;

public class Student extends Person{
	
		private String schoolName;
		
		public Student() {} // 디폴트 생성자
		public Student(String name, int age, String schoolName) {
			super(name, age);
			this.schoolName = schoolName;
		} // 인자 값 있는 생성자
		
		// 메소드
		public void showStudentInfo() {
			super.showInfo();
			System.out.println("학교 : " + schoolName);
		}
		
}
