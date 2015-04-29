package day1;

public class A01_Basic {
	public static void main(String[] args) {

		String jangName = "장그래";
		int jangAge = 26;
		String jangPosition = "인턴";
		int jangSalary = 150;
		double jangComm = 0.0;
		String jangHire = "2015/2/2";
		System.out.println("이름: " + jangName + "\t나이: " + jangAge + "세\n직급: "
				+ jangPosition + "\t입사일: " + jangHire + "\n월급: " + jangSalary
				+ "만원\t보너스: " + jangComm + "%\n----------------------------------");

		String ohName = "오상식";
		int ohAge = 43;
		String ohPosition = "과장";
		int ohSalary = 5000;
		double ohComm = 0.05;
		String ohHire = "2000/3/15";
		System.out.println("이름: " + ohName + "\t나이: " + ohAge + "세\n직급: "
				+ ohPosition + "\t입사일: " + ohHire + "\n연봉: " + ohSalary
				+ "만원\t보너스: " + ohComm + "%\n----------------------------------");

		String ahnName = "안영이";
		int ahnAge = 26;
		String ahnPosition = "사원";
		int ahnSalary = 3900;
		double ahnComm = 0.02;
		String ahnHire = "2014/5/8";
		System.out.println("이름: " + ahnName + "\t나이: " + ahnAge + "세\n직급: "
				+ ahnPosition + "\t입사일: " + ahnHire + "\n월급: " + ahnSalary
				+ "만원\t보너스: " + ahnComm + "%\n----------------------------------");

		// [ 클래스를 사용하지 않는 비객체지향적인 코드 ] 
		// 단점
		//  : 비슷한 내용의(같은 종류) 데이터를 담는 변수들을 일일이
		//    선언하고 사용하여서 변수 사용이 잦다. 비경제적이다.
		
	}
}
