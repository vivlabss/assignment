package day1;

public class A07_Dog extends A07_Animal {

	String name;
	String kind;

	public A07_Dog() {
	}

	public A07_Dog(String kind, String name) {
		super("강아지");
		this.name = name;
		this.kind = kind; // Dog 의 종류를 나타냄 ex. 허스키, 치와와
	}

	// Animal 의 kind 와 겹칠까? 아니다!
	// 동물종류 강아지종류 이름
	public A07_Dog(String kind1, String kind2, String name) {
		super(kind1);
		this.kind = kind2;
		this.name = name;
	}
	
	@Override
	public void breath() {
		System.out.println("폐로 숨쉬기!");
	}
}
