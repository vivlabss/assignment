package day1;

public class A07_Test1 {
	public static void main(String[] args) {

		// [ 부모 객체, 자식 객체의 변수 접근에 대한 이해를 돕는 코드 예시 ]
		
		A07_Dog dog = new A07_Dog("강아지", "허스키", "숙희");
		System.out.println(dog.name); // 숙희
		System.out.println(dog.kind); // 허스키
		System.out.println(((A07_Animal) dog).kind); // 강아지

		System.out.println();

		// [ is a 관계 ]모든 객체의 Data type 은 부모가 될 수 있다.
		// ex) A07_Animal a = new A07_Dog();

		A07_Animal dog2 = new A07_Dog("강쥐", "허스키", "숙희");
		// System.out.println(dog2.name); // error. A07_Animal 범위로 줄어들어서.

		System.out.println(((A07_Dog) dog2).name); // 숙희
		System.out.println(dog2.kind); // 강쥐

		System.out.println();

		// A07_Dog dog3 = new A07_Animal(); // compile error
		A07_Dog dog3 = new A07_Dog("치와와", "치치");
		System.out.println(dog3.kind); // 치와와
		System.out.println(((A07_Animal) dog3).kind); // 강아지

		System.out.println();

		Object dog4 = new A07_Dog("강쥐", "푸들", "초코");
		// System.out.println(dog4.name);
		// System.out.println(((A07_Animal)dog4).name);
		System.out.println(((A07_Dog) dog4).name); // 초코
		// System.out.println(dog4.kind);
		System.out.println(((A07_Animal) dog4).kind); // 강쥐
		System.out.println(((A07_Dog) dog4).kind); // 푸들

		System.out.println();

		Object dog5 = new A07_Dog("푸들", "초코");
		// System.out.println(dog4.name);
		// System.out.println(((A07_Animal)dog5).name);
		System.out.println(((A07_Dog) dog5).name); // 초코
		// System.out.println(dog5.kind);
		System.out.println(((A07_Animal) dog5).kind); // 강아지
		System.out.println(((A07_Dog) dog5).kind); // 푸들

		System.out.println();

		A07_Fish f = new A07_Fish();
		f.breath(); // 오버라이딩 안하면 폐로 숨쉬기! 근데 물고기는 폐가 없잖아.
					// 부모로부터 물려받았지만 나에게 적합하지 않은 것 재정의 -> Method 오버라이딩
		((A07_Animal) f).breath(); // 오버라이딩에서 바뀌는 call mechanism!
		// 그래서 이 경우 A07_Animal 영역을 본다해도 A07_Fish의 breath를 호출해서 '부레로 숨쉬기!'를 출력하게 된다!
		// (중요!) 오버라이딩된 자원에 한해서만 다운캐스팅 하지않아도 부모타입에서 자식타입의 함수를 호출 가능!
		// 이러면 이식성이 좋아진다는 장점~! 오버라이딩 쓰는 이유.
		System.out.println(f.kind); // 물고기
		System.out.println(f.size);

		System.out.println();

		A07_Animal f2 = new A07_Fish();
		System.out.println(f2.kind);
		// System.out.println(f2.size); // error
		System.out.println(((A07_Fish) f2).size); // 0

	}
}
