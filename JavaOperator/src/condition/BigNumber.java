package condition;
/*
 *  @ Date : 2015.07.10
 *  @ Author : me
 *  @ Story : if-else 예제
 * */

import java.util.Scanner;

public class BigNumber {
	public static void main(String[] args) {
		/*
		 * 문제) 학생3명의 점수를  입력받아서 1등을 출력(0~100점 사이)
		 * 
		 * 결과) 
		 * 1,2,3
		 * 1등은 홍길동이며 98점입니다. 
		 * 
		 * 힌트) a 와 b를 비교, b와 c를 비교하고 다시 a 와 c를 비교 해야합니다
		 * */
		int a=0 , b=0 ,c=0,top=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("a값 입력");
		a = scanner.nextInt();
		System.out.println("b값 입력");
		b = scanner.nextInt();
		System.out.println("c값 입력");
		c = scanner.nextInt();
		
		if ((a>=b) &&(a>=c) ) {
			top = a;
			//System.out.println("1등은 홍길동이며" + a);
			
		} else if((b>=a)&&(b>=c)){
			top = b;
			//System.out.println("1등은 홍길동이며" + b);

		}else if(c>=a && c>=b){
			top = c;
			//System.out.println("1등은 홍길동이며" + c);
		} else{
			System.out.println("동점자가 존재합니다. ");
		}
			System.out.println("1등은" + top);
		}
		
		
		
	}

