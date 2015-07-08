package operator;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		/*
		 * order
		 * 스캐너로 두 값을 입력받아서
		 * 사칙연산 결과가 나오도록 하시오.
		 * 20 + 7 = 21
		 * 20 * 7 = 140
		 * */
		
		Scanner scanner = new Scanner(System.in);
		int eng=0 , math=0 , mok = 0, nmg=0;
		System.out.println("첫번째 값을 입력");
		eng = scanner.nextInt();//next 커서 다음 글자(숫자)를 변수 할당하라 
		System.out.println("두번째 값을 입력");
		math = scanner.nextInt();
		
		//mok = eng + math;
		//System.out.println(eng + "+" + math + "\t" + mok);
		//nmg = eng * math;
		//System.out.println(eng + "+" + math + "\t" + nmg);
		
		
		
	}

}
