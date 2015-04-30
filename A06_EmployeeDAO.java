package day1;

public class A06_EmployeeDAO {

	// DAO에는 생성자 및 메소드들이 정의된다.
	
	private A06_EmployeeVO vo = null;

	A06_EmployeeDAO(String name, int age, String position, int salary, double comm, String hire) {
		vo = new A06_EmployeeVO();
		vo.setName(name);
		vo.setAge(age);
		vo.setPosition(position);
		vo.setSalary(salary);
		vo.setComm(comm);
		vo.setHire(hire);
	}

	// 메소드를 사용하여 main 에서 여러번 코드를 작성해야 하는 일을 줄인다.
	// main 에서 객체명.display()로 호출하기만 하면 된다.
	public void display() {
		if (vo.getPosition().equals("인턴")) {
			System.out.println("이름: " + vo.getName() + "\t나이: " + vo.getAge() + "세\n직급: "
					+ vo.getPosition() + "\t입사일: " + vo.getHire() + "\n월급: " + vo.getSalary()
					+ "만원\t보너스: " + vo.getComm()
					+ "%\n----------------------------------");
		} else {
			System.out.println("이름: " + vo.getName() + "\t나이: " + vo.getAge() + "세\n직급: "
					+ vo.getPosition() + "\t입사일: " + vo.getHire() + "\n연봉: " + vo.getSalary()
					+ "만원\t보너스: " + vo.getComm()
					+ "%\n----------------------------------");
		}
	}
}
