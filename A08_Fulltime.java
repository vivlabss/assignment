package day1;

import day1.A06_EmployeeVO;

public class A08_Fulltime implements A08_Employee {

	private A06_EmployeeVO vo = null;
	
	public A08_Fulltime(String name, int age, String position, int salary, double comm, String hire) {
		vo = new A06_EmployeeVO();
		vo.setName(name);
		vo.setAge(age);
		vo.setPosition(position);
		vo.setSalary(salary);
		vo.setComm(comm);
		vo.setHire(hire);
	}
	
	// interface 의 메소드를 구현하는 부분
	// Fulltime 인 직원은 salary 항목을 연봉으로 표시한다.
	@Override
	public void display() {
		System.out.println("이름: " + vo.getName() + "\t나이: " + vo.getAge() + "세\n직급: "
				+ vo.getPosition() + "\t입사일: " + vo.getHire() + "\n연봉: " + vo.getSalary()
				+ "만원\t보너스: " + vo.getComm()
				+ "%\n----------------------------------");
	}

}
