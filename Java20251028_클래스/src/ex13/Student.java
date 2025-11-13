package ex13;

public class Student {

		private String name;	//변수
		private int ban;
		private int no;
		private int kor;
		private int eng;
		private int math;
		
		public String getName() {
			return name;
		}
		
		Student(){		//생성자
			
		}

		public Student(String name, int ban, int no, int kor, int eng, int math) {
			this.name = name;
			this.ban = ban;
			this.no = no;
			this.kor = kor;
			this.eng = eng;   //우클릭 - 소스 - 
			this.math = math;
		}
		
		public int getTotal() {
			return kor+eng+math;
		}// getTotal 메소드
		
		
		public float getAverage() {
			float avg = Math.round(getTotal()/3.0f*10)/10.0f;
			
			return avg;
		} // getAverage 메소드
		
		
		public float getAverage2() {
			float avg = getTotal()/3.0f;
			
			return avg;
		} //getAverage2메소드
		
		
		public String info() {
			return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math
					+ "," + getTotal() + "," + getAverage();
		}
}
