package ifCondition;

import java.util.Scanner;

/*
 * @ Date : 2015.07.09
 * @ Author : me
 * @ Story : 사칙 연산 프로그램
 * 
 * */
public class ArithmeticCalc {
	public void calc(){
		/*
		 * 사칙 연산 계산기
		 * 덧셈,뺄셈,곱셈,나눗셈(몫 :(),나머지 :())
		 * 사칙연산 기호도 입력받습니다.+, *, -, / 
		 * 출력결과
		 * ===심플계산기====
		 * 5 X 5 = 25
		 * 5 + 5 = 10
		 * 6 ÷ 5 = 1 (1)
		 * 5 - 6 = -1 
		 * */
		int a = 0, b =0, result=0, nmg=0;
		String opcode = "";
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫번째 값");
		a = scanner.nextInt();
		System.out.println("기호 입력");
		opcode = scanner.next();
		System.out.println("두번째 값");
		b = scanner.nextInt();
		System.out.println(" ===심플계산기====");
		if (opcode.equals("+")) {
			opcode = "+";
			result = a+b;
			System.out.println(a+opcode+b+"="+result);
		} else if(opcode.equals("-")){
			opcode = "-";
			result = a-b;
			System.out.println(a+opcode+b+"="+result);
		}else if(opcode.equals("*")){
			opcode = "X";
			result = a*b;
			System.out.println(a+opcode+b+"="+result);
		}else if(opcode.equals("/")){
			opcode = "÷";
			result = a/b;
			nmg = a%b;
			System.out.println(a+opcode+b+"="+result+"("+nmg+")");
			
		}else{
			System.out.println("입력된 값이 올바르지 않습니다.");
			
		}
		
	
	}
}
