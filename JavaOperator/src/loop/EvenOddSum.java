package loop;

import java.util.Scanner;

/*
 *  @ Date : 2015.07.13
 *  @ Author : me
 *  @ Story : for loop + if문 결합예제
 * */
public class EvenOddSum {
	/*
	 * 1부터 입력받은 수(10)까지의 수 중에서 각각 짝수의 합과 홀수의 합을 분리해서 출력하시오.
	 * 
	 * */
	public void calc() {
		int a = 0, b = 0;
		int evenSum=0, oddSum=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("시작값을 입력하세요");
		a = scanner.nextInt();  
		System.out.println("한계값을 입력하세요");
		//if(a>b && a==b){
		//System.out.println("시작값보다 한계값이 커야합니다.");
		//}else{
		//}
		b = scanner.nextInt();
		
		//홀수 if(input%2==1)
		
		for (int i = a; i <= b ; i++) {
			if (i%2==1) {
				oddSum += i;
				
			}else{
				evenSum += i;
				
			}
		}
		
		
		System.out.println(a +"부터"+b+"까지의 정수 중에서 \n"
				+ "짝수의 합은"+ evenSum+"이고 \n"
				+ "홀수의 합은"+oddSum+"이다.");
	}
}
