package day1;

// 상속을 알아보자!
// 부모 객체 Animal
public class A07_Animal {
	
	String kind;

	public A07_Animal() {
	}

	public A07_Animal(String kind) {
		this.kind = kind;
	}

	public void breath() {
		System.out.println("숨쉬기!");
	}

	public void eat() {
		System.out.println("먹기!");
	}

}
