package day1;

public class A05_Employee {
	// 캡슐화
	private String name;
	private int age;
	private String position;
	private int salary;
	private double comm;
	private String hire;

	// 기본생성자
	A05_Employee() {

	}
	
	// Constructor Overloading
	A05_Employee(String name, int age, String position, int salary,
			double comm, String hire) {
		this.name = name;
		this.age = age;
		this.position = position;
		this.salary = salary;
		this.comm = comm;
		this.hire = hire;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public double getComm() {
		return comm;
	}

	public void setComm(double comm) {
		this.comm = comm;
	}

	public String getHire() {
		return hire;
	}

	public void setHire(String hire) {
		this.hire = hire;
	}

	@Override
	public String toString() {
		return "A04_Employee [name=" + name + ", age=" + age + ", position="
				+ position + ", salary=" + salary + ", comm=" + comm
				+ ", hire=" + hire + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		long temp;
		temp = Double.doubleToLongBits(comm);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((hire == null) ? 0 : hire.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((position == null) ? 0 : position.hashCode());
		result = prime * result + salary;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		A05_Employee other = (A05_Employee) obj;
		if (age != other.age)
			return false;
		if (Double.doubleToLongBits(comm) != Double
				.doubleToLongBits(other.comm))
			return false;
		if (hire == null) {
			if (other.hire != null)
				return false;
		} else if (!hire.equals(other.hire))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (position == null) {
			if (other.position != null)
				return false;
		} else if (!position.equals(other.position))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}

	// 메소드를 사용하여 main 에서 여러번 코드를 작성해야 하는 일을 줄인다.
	// main 에서 객체명.display()로 호출하기만 하면 된다. 
	public void display() {
		if(position.equals("인턴")){
			System.out.println("이름: " + name + "\t나이: " + age + "세\n직급: "
					+ position + "\t입사일: " + hire + "\n월급: " + salary
					+ "만원\t보너스: " + comm
					+ "%\n----------------------------------");	
		}else {
			System.out.println("이름: " + name + "\t나이: " + age + "세\n직급: "
					+ position + "\t입사일: " + hire + "\n연봉: " + salary
					+ "만원\t보너스: " + comm
					+ "%\n----------------------------------");
		}
	}

}
