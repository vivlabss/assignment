package day1;

public interface A08_Employee {
	
	// interface 는 메소드의 이름만 선언하고
	// 이 interface 를 implements 하는 클래스(들)에서 그 몸통을 구현한다.
	// 강제성을 가지기 때문에 interface 를 implements 하면서 메소드를 구현하지 않으면
	// 컴파일조차 되지 않는다.
	// 인터페이스의 메소드는 항상 public 이어야 한다.
	
	public void display();
	
}
