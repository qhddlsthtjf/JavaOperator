package variable;

import java.util.Scanner;

public class InputTotal {
	public static void main(String[] args) {
		//int kor = 0, eng =0, math=0;   //디폴트 값 선언 : 지역변수 초기화
		//int kor, eng, math; //인스턴스 변수 선언법
		Scanner scanner = new Scanner(System.in);
		
		//연산부, 프로세싱
		System.out.println("국어점수를 입력하세요");
		int kor = scanner.nextInt();
		System.out.println("영어점수를 입력하세요");
		//int eng = 0;
		int eng = scanner.nextInt();
		System.out.println("수학점수를 입력하세요");
		//int math = 0;
		int math = scanner.nextInt();
		//total 지역변수를 연산 식으로 초기화 함
		int total = kor + eng + math;
		System.out.println("총점 : " + total);
	}

}
