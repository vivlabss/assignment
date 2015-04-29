package day1;

public class A02_Array {
	public static void main(String[] args) {

		String[] name = { "장그래", "오상식", "안영이" };
		int[] age = { 26, 43, 26 };
		String[] position = { "인턴", "과장", "사원" };
		int[] salary = { 150, 5000, 3900 };
		double[] comm = { 0.0, 0.05, 0.02 };
		String[] hire = { "2015/2/2", "2000/3/15", "2014/5/8" };
		
		for (int i = 0; i < name.length; i++) {
			System.out.println("이름: " + name[i] + "\t나이: " + age[i] + "세\n직급: "
					+ position[i] + "\t입사일: " + hire[i] + "\n월급 or 연봉: " + salary[i]
					+ "만원\t보너스: " + comm[i]
					+ "%\n----------------------------------");
		}
		
		// [ 배열을 사용한 데이터 관리 ]
		// 같은 타입(ex. 이름, 나이)의 데이터들을 배열에 넣어서 사용
		// 단점
		//  : 여전히 변수를 많이 사용해야하고, 데이터가 추가될 경우 관리하기 힘들다.
		//  : 약간씩 다른 정보를 처리하기 힘들다.
	}
}
