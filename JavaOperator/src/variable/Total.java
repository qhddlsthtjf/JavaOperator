package variable;

public class Total {
	public static void main(String[] args) {
		//국어점수는 데이터 타입이 정수이다.
		//변수명은 kor
		// 할당된 값은 80
		
		//int kor = 80;
		//System.out.println(kor);
		//int eng = 70;
		//int math = 50;
		// 같은 데이터 타입의 변수를 여러개 
		// 선언과 할당 할때는 다음과 같이 한다.
		int kor=60,eng=60,math=60;
		int total = 0; //지역변수 초기화
		total = kor + eng + math;
		int avg = 0; //평균구하기 : 총점 나누기 과목수 
		//avg = (kor + eng + math)/3;
		avg = total/3;
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
	}

}
