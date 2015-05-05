package day1;

import java.util.ArrayList;

public class A08_EmployeeMain {
	
	public static void main(String[] args) {
		
		ArrayList<A08_Employee> emp = new ArrayList<>();
		
		A08_Parttime jang = new A08_Parttime("장그래", 26, "인턴", 150, 0.0, "2015/2/2");
		A08_Fulltime oh = new A08_Fulltime("오상식", 43, "과장", 5000, 0.05, "2000/3/15");
		A08_Fulltime ahn = new A08_Fulltime("안영이", 26, "사원", 3900, 0.02, "2014/5/8");
		emp.add(jang);
		emp.add(oh);
		emp.add(ahn);
		
		System.out.println("[ 사원 정보 ]\n----------------------------------");
		for (int i = 0; i < emp.size(); i++) {
			emp.get(i).display();
		}
		
	}
}
