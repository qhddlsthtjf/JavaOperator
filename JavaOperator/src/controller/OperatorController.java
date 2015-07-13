package controller;

import condition.ArithmeticCalc;
import condition.CalcAvg;
import condition.ManOrWomen;
import condition.SwitchAvg;
import loop.EvenOddSum;


public class OperatorController {
	public static void main(String[] args) {
		//2015.07.09 성적계산기 
		CalcAvg avg = new CalcAvg();
		//avg.calcAvg();
		//2015.07.09 사칙연산 계산기
		ArithmeticCalc calc = new ArithmeticCalc();
		//calc.calc();
		//2015.07.10 스위치문 평균 성적 계산기
		SwitchAvg switchavg = new SwitchAvg();
		//switchavg.calc();
		//2015.07.10 스위치문 성별판단
		ManOrWomen manOrWomen = new ManOrWomen();
		//manOrWomen.ssn(); //ssn()은 원 클래스의 메소드 이름이다.
		//2015.07.13 for문 + if문 예제 
		EvenOddSum evenOddSum = new EvenOddSum();
		evenOddSum.calc();
	}
}
