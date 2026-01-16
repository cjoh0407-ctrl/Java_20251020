package my_ex;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 직원들의 리스트에서 급여가 5,000 이상인 직원들의 이름만 추출하여 대문자로 변환한 리스트를 만드세요.

class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    
    public String getName() { 
    	return name; 
    }
    
    public int getSalary() { 
    	return salary; 
    }
}

public class ex1 {

	public static void main(String[] args) {
		
		List<Employee> employees = Arrays.asList(
	            new Employee("Alice", 4000),
	            new Employee("Bob", 6000),
	            new Employee("Charlie", 5500),
	            new Employee("David", 3000));
		
		
		List<String> list = employees.stream()
							.filter(p -> p.getSalary()>=5000)	// 급여 5000이상
							.map(n -> n.getName().toUpperCase())	// 이름추출, 대문자로 변환
							.collect(Collectors.toList());	// 리스트로 반환
			
		System.out.println(list);
	}

}

