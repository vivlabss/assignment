package day1;

import java.util.ArrayList;

public class A05_EmployeeMain {
	public static void main(String[] args) {
		
		A05_Employee jang = new A05_Employee("장그래", 26, "인턴", 150, 0.0, "2015/2/2");
		A05_Employee oh = new A05_Employee("오상식", 43, "과장", 5000, 0.05, "2000/3/15");
		A05_Employee ahn = new A05_Employee("안영이", 26, "사원", 3900, 0.02, "2014/5/8");
		
		ArrayList<A05_Employee> emp = new ArrayList<>();
		emp.add(jang);
		emp.add(oh);
		emp.add(ahn);
		
		System.out.println("[ 사원 정보 ]\n----------------------------------");
		for (A05_Employee e : emp) {
			e.display();
		}
		
		// [ 생성자, 메소드를 사용하는 클래스 ]
		// 생성자를 이용하여 객체에 데이터를 넣으면서 초기화
		// 변수명을 일일이 쓸 필요가 없어지기 때문에 보다 편리하고 코드 또한 간결하다.
		// display() 메소드를 클래스에 정의해두었기 때문에 매번 코드를 쓸 필요도 없다.
		// 보다 직관적인 코드 작성이 가능하다.
		
	}
}
