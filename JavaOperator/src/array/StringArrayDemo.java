package array;
/*
 *  @ Date : 2015.07.13
 *  @ Author : me
 *  @ Story : String형(문자열형) 배열 예제
 * */
public class StringArrayDemo {
	/*
	 * 자바에서 배열문법
	 * 1.무조건 같은 type
	 * 2.배열은 크기가 있어야 함
	 * 3.배열 크기는 객체.length
	 * 4.배열은 new 로 생성하고, 메모리영역 heap에 할당
	 * 5.배열 출력은 for 문으로 한다.
	 * */
	public static void main(String[] args) {
	
		String[] strarr = new String[3];
		strarr[0] = "1";//리터럴 타입 1을 첫번째에 할당
		strarr[1] = "2";
		strarr[2] = "3";
		
		for (int i = 0; i < strarr.length; i++) {
			//System.out.println(i+"\t"); //인덱스 값이 출력
			System.out.println(strarr[i]);
		}
	}
	
	
	
	
	
	
}
