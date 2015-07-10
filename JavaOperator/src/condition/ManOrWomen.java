package condition;

import java.util.Scanner;

/*
 *  @ Date : 2015.07.10
 *  @ Author : me
 *  @ Story : switch 예제 (남성 판별)
 * */
public class ManOrWomen {
	public void ssn() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요(예 800101-2123456)");
		String ssn = scanner.next(), msg ="";
		char ch = ssn.charAt(7);//인덱스값 자리는 0부터 시작 7번째 자리 값 가저온다
		/*
		 * char At(n) 메소드는 0부터 시작하여 
		 * n번째 글자 하나만 출력하는데  프로그래밍에서는 리턴 값이라고 한다.
		 * 위 예 같은 상황에서는  리턴값이 2가 된다.
		 * 
		 * ssn 의 체계
		 * 1,3 번 남자
		 * 2,4 번여자
		 * 5번 외국인 
		 * 나머지 잘못입력된 값
		 * */
		
		switch (ch) {
		case '1':case '3': msg = "남자"; break;
		case '2':case '4': msg = "여자"; break;
		case '5': msg = "외국인"; break;

		default: System.out.println("잘못입력된 값 입니다."); break;
		}
		System.out.println("입력하신 ssn은 " + msg +"입니다");
	}
}
