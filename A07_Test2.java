package day1;

public class A07_Test2 {
	public static void main(String[] args) {

		// [ 상속 관계를 가진 객체들의 오버라이딩 관련된 내용의 이해를 돕는 코드 예시 ]
		
		A07_Animal[] animals = { new A07_Dog("강아지", "진돗개", "진돌이"), new A07_Fish("물고기", 0) };
		// animals 에는 A07_Dog, A07_Fish 모두 들어갈 수 있다!
		// (같이 관리 가능) 모든 (데이터 객체 타입은 부모가 될 수 있다)
		// 상속 잘 이용하면 다른 객체들을 동일한 배열에 저장 가능

		// A07_Animal type 인데 A07_Dog, A07_Fish 로
		// casting 해서 보고싶을 때 잘못하면 cast exception 발생
		// 어떻게 해결? instanceof 연산자!
		for (A07_Animal data : animals) {
			if (data instanceof A07_Dog)
				System.out.println(((A07_Dog) data).kind); // ClassCastException
														// 발생하지 않음
			else if (data instanceof A07_Fish)
				System.out.println(((A07_Fish) data).kind);
		}

		for (A07_Animal data : animals) {
			data.breath();
		}

		// 폐로 숨쉬기!
		// 부레로 숨쉬기!	// 자식(A07_Fish)영역임에도 불구하고 오버라이딩되어있기 때문에 가능

		// 오버라이딩 강제성은 없다!!
	}

}
