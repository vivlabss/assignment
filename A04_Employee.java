package day1;

public class A04_Employee {

	// 캡슐화
	private String name;
	private int age;
	private String position;
	private int salary;
	private double comm;
	private String hire;

	// 기본 생성자
	A04_Employee() {

	}

	// field 들에 private 접근 제한자를 추가하였으므로 외부에서 쉽게 접근, 수정할 수 없다.
	// 접근, 수정하기 위한 메소드로 set~, get~ 메소드를 사용한다.
	// Source > Generate Getters and Setters 메뉴로 쉽게 생성할 수 있다.
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

	// 기존의 객체와 똑같은 내용을 가진 객체를 생성하였을 때 메모리의 낭비를 방지하기 위해
	// hashCode함수는 그 객체가 기존 객체와 같은 주소값을 가리키게끔 만든다.
	// 객체의 내용이 변경될 때 다른 주소값을 가지게 한다.
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

	// 객체들 간의 내용 비교를 위해 equals 를 오버라이딩 한다.
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		A04_Employee other = (A04_Employee) obj;
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

}
