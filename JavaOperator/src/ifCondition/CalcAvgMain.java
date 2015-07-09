package ifCondition;

import java.util.Scanner;

/*
 *  @ Date : 2015.07.09
 *  @ Author : me
 *  @ Story : If-else 예제
 *  	프로그램을 하나 개발해야 합니다.
 *  	오더는 
 *  	학생	국어	영어	수학	총점	평균	합격여부
 *  	---------------------------------------------
 *  (홍길동) (90) (90) (90) (270) (90) (장학생)
 *  
 *  평균이 90점이상이면 장학생 
 *  평균이 70점이상 -90점미만이면 합격
 *  평균이 70점 미만이면 불합격 
 * */
public class CalcAvgMain {
	public static void main(String[] args) {
		//선언부
		Scanner scanner = new Scanner(System.in);
		int kor=0, eng=0, math=0, total=0, avg=0;
		String stu = "", a="";
		
		//연산부
		System.out.println("이름을 입력하세요");
		stu = scanner.next();
		
		System.out.println("국어점수 입력");
		kor = scanner.nextInt();
		System.out.println("영어점수 입력");
		eng = scanner.nextInt();
		System.out.println("수학점수 입력");
		math = scanner.nextInt();
		
		total = kor + eng + math;
		avg =(int) total/3; //다운 캐스팅 .소수점 이하 버림
		/*
		if (avg>=90) {
			System.out.println("학생\t국어\t영어\t수학\t총점\t평균\t장학생");
			System.out.println("--------------------------------------------");
			a = "장학생";
			System.out.println(stu+"\t"+kor+"\t"+eng+"\t"+math+"\t"+total+"\t"+avg+"\t"+a);
			
		} else { if (avg>=70 && avg<90) {
			System.out.println("학생\t국어\t영어\t수학\t총점\t평균\t장학생");
			System.out.println("--------------------------------------------");
			a = "합격";
			System.out.println(stu+"\t"+kor+"\t"+eng+"\t"+math+"\t"+total+"\t"+avg+"\t"+a);
			
			
		} else {
			System.out.println("학생\t국어\t영어\t수학\t총점\t평균\t장학생");
			System.out.println("--------------------------------------------");
			a = "불합격";
			System.out.println(stu+"\t"+kor+"\t"+eng+"\t"+math+"\t"+total+"\t"+avg+"\t"+a);

		}*/
		
	
		
		if (avg>=90) {
			a = "장학생";
		} else if(avg>=70 && avg<90){
			a = "합격";
		}else{
			a = "불합격";
		}
		
		
		//출력부
		System.out.println("학생	국어	영어	수학	총점	평균	합격여부");
		System.out.println("---------------------------------------------");
		System.out.println(stu+"\t"+kor+"\t"+eng+"\t"+math+"\t"+total+"\t"+avg+"\t"+a);
		
	
	}
		
		 
		
			
		
	}


