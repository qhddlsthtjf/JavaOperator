package array;

import java.util.Scanner;

/*
 *  @ Date : 2015.07.13
 *  @ Author : me
 *  @ Story : int형(숫자형) 배열에서 입력값 중 최대값 구하기
 * */
public class InputMax {
	public static void main(String[] args) {
		//배열의 선언 및 초기화 
		//for-loop 으로 입력받으시고
		//비교로직은 if 문을 사용하세요
		
		System.out.println("3개의 점수를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int max = 0;
		int[] arr = new int[3];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
			if (arr[i]>max) {
				max = arr[i];
			}
				
			
		}
		System.out.println(max);
		
	}
}
