package day1;

public class A06_EmployeeVO {

	// VO에는 field, 일부 override method 들만 선언 및 정의된다.
	
	private String name;
	private int age;
	private String position;
	private int salary;
	private double comm;
	private String hire;

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
		A06_EmployeeVO other = (A06_EmployeeVO) obj;
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
