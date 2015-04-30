package day1;

import java.util.ArrayList;

public class A06_EmployeeMain {
	public static void main(String[] args) {
		
		A06_EmployeeDAO jang = new A06_EmployeeDAO("장그래", 26, "인턴", 150, 0.0, "2015/2/2");
		A06_EmployeeDAO oh = new A06_EmployeeDAO("오상식", 43, "과장", 5000, 0.05, "2000/3/15");
		A06_EmployeeDAO ahn = new A06_EmployeeDAO("안영이", 26, "사원", 3900, 0.02, "2014/5/8");
		
		ArrayList<A06_EmployeeDAO> emp = new ArrayList<>();
		emp.add(jang);
		emp.add(oh);
		emp.add(ahn);
		
		System.out.println("[ 사원 정보 ]\n----------------------------------");
		for (A06_EmployeeDAO e : emp) {
			e.display();
		}
	}
}
