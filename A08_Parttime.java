package day1;

import day1.A06_EmployeeVO;

public class A08_Parttime implements A08_Employee {

	private A06_EmployeeVO vo = null;
	
	public A08_Parttime(String name, int age, String position, int salary, double comm, String hire) {
		vo = new A06_EmployeeVO();
		vo.setName(name);
		vo.setAge(age);
		vo.setPosition(position);
		vo.setSalary(salary);
		vo.setComm(comm);
		vo.setHire(hire);
	}
	
	// interface 의 메소드를 구현하는 부분
	// Parttime 인 직원은 salary 항목을 월급으로 표시한다.
	@Override
	public void display() {
		System.out.println("이름: " + vo.getName() + "\t나이: " + vo.getAge() + "세\n직급: "
				+ vo.getPosition() + "\t입사일: " + vo.getHire() + "\n월급: " + vo.getSalary()
				+ "만원\t보너스: " + vo.getComm()
				+ "%\n----------------------------------");
	}

}
