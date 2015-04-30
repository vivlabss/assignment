package day1;

public class A07_Fish extends A07_Animal {

	int size;

	public A07_Fish() {
		super("물고기");		// 부모 객체 생성자 사용할 때 super( )
	}

	public A07_Fish(String kind, int size) {
		super(kind);
		this.size = size;
	}

	// 오버라이딩 규칙
	// 선언부는 그대로 유지한다.
	// 따라서 오타 하나에도 다른 함수로 인식됨에 유의.
	// JDK 1.5부터 Annotation 기능을 제공한다. (@Override)
	@Override
	public void breath() {
		System.out.println("부레로 숨쉬기!");
	}
}
