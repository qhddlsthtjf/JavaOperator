package array;

import java.util.Scanner;

/*
 *  @ Date : 2015.07.13
 *  @ Author : me
 *  @ Story : int형(숫자형) 배열 입력 예제
 * */
public class InputSum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[3]; 
		int sum = 0, avg =0;
		System.out.println("3개의 점수를 입력하세요");
		
		for (int i = 0; i < arr.length; i++) {//배열에 값을 입력하라고 하면 무조건 for ctrl+space
			arr[i] = scanner.nextInt();
			//sum += arr[i];
			//avg = sum / 3;
		}
		
		
		//입력된 값을 출력해 보세요 
		for (int i = 0; i < arr.length; i++) {
			//System.out.println("입력된 값 출력" + arr[i]);
			sum += arr[i];
			//avg = sum / arr.length;
		}
		System.out.println("합 : "+sum);
		avg = sum / arr.length;
		System.out.println("평균 : "+avg);
	}
}
