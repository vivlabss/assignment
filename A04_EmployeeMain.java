package day1;

import java.util.ArrayList;

public class A04_EmployeeMain {
	public static void main(String[] args) {
		
		ArrayList<A04_Employee> emp = new ArrayList<>();
		
		A04_Employee jang = new A04_Employee();
		jang.setName("장그래");
		jang.setAge(26);
		jang.setPosition("인턴");
		jang.setSalary(150);
		jang.setComm(0.00);
		jang.setHire("2015/2/2");
		emp.add(jang);
		
		A04_Employee oh = new A04_Employee();
		oh.setName("오상식");
		oh.setAge(43);
		oh.setPosition("과장");
		oh.setSalary(5000);
		oh.setComm(0.05);
		oh.setHire("2000/3/15");
		emp.add(oh);

		A04_Employee ahn = new A04_Employee();
		ahn.setName("안영이");
		ahn.setAge(26);
		ahn.setPosition("사원");
		ahn.setSalary(3900);
		ahn.setComm(0.05);
		ahn.setHire("2014/5/8");
		emp.add(ahn);
		
		for (int i = 0; i < emp.size(); i++) {
			if(emp.get(i).getPosition().equals("인턴")){
				System.out.println("이름: " + emp.get(i).getName() + "\t나이: " + emp.get(i).getAge() + "세\n직급: "
						+ emp.get(i).getPosition() + "\t입사일: " + emp.get(i).getHire() + "\n월급: " + emp.get(i).getSalary()
						+ "만원\t보너스: " + emp.get(i).getComm()
						+ "%\n----------------------------------");	
			}else {
				System.out.println("이름: " + emp.get(i).getName() + "\t나이: " + emp.get(i).getAge() + "세\n직급: "
						+ emp.get(i).getPosition() + "\t입사일: " + emp.get(i).getHire() + "\n연봉: " + emp.get(i).getSalary()
						+ "만원\t보너스: " + emp.get(i).getComm()
						+ "%\n----------------------------------");	
			}
		}
		
		// [ 캡슐화 된 클래스 사용 ]
		// 캡슐화 문제는 해결하였지만 데이터를 설정하는 과정이 번거롭다는 단점이 여전히 남아있다.
		// 출력 또한 불편하다.
	}
}
