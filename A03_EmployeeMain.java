package day1;

import java.util.ArrayList;

public class A03_EmployeeMain {
	public static void main(String[] args) {
		
		A03_Employee jang = new A03_Employee();
		jang.name = "장그래";
		jang.age = 26;
		jang.position = "인턴";
		jang.salary = 150;
		jang.comm = 0.00;
		jang.hire = "2015/2/2";
		
		A03_Employee oh = new A03_Employee();
		oh.name = "오상식";
		oh.age = 43;
		oh.position = "과장";
		oh.salary = 5000;
		oh.comm = 0.05;
		oh.hire = "2000/3/15";
		
		A03_Employee ahn = new A03_Employee();
		ahn.name = "안영이";
		ahn.age = 26;
		ahn.position = "사원";
		ahn.salary = 3900;
		ahn.comm = 0.02;
		ahn.hire = "2014/5/8";
		
		ArrayList<A03_Employee> emp = new ArrayList<>();
		emp.add(jang);
		emp.add(oh);
		emp.add(ahn);
		
		for (int i = 0; i < emp.size(); i++) {
			if(emp.get(i).position.equals("인턴")){
				System.out.println("이름: " + emp.get(i).name + "\t나이: " + emp.get(i).age + "세\n직급: "
						+ emp.get(i).position + "\t입사일: " + emp.get(i).hire + "\n월급: " + emp.get(i).salary
						+ "만원\t보너스: " + emp.get(i).comm
						+ "%\n----------------------------------");	
			}else {
				System.out.println("이름: " + emp.get(i).name + "\t나이: " + emp.get(i).age + "세\n직급: "
						+ emp.get(i).position + "\t입사일: " + emp.get(i).hire + "\n연봉: " + emp.get(i).salary
						+ "만원\t보너스: " + emp.get(i).comm
						+ "%\n----------------------------------");
			}
		}
		
		// [ 클래스를 활용한 기본적인 데이터 관리 ]
		// 하나의 묶음(객체)으로 데이터를 관리할 수 있다는 장점이 있지만
		// 캡슐화하지 않아서 외부에서 값을 쉽게 접근하거나 변경할 수 있다는 단점도 있다.
		// 일일이 데이터를 정의하기 때문에 번거롭기도 하다.
		
	}
}
