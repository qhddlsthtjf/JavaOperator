package condition;

public class OnlyIf {
	public static void main(String[] args) {
		int x=1, y=2;//지변 초기화 
		if ((x==1)&&(y==1)) {// && 엔퍼센트라고 읽고 and연산자
			System.out.println("x 는 1이면서, y도 2이다.");			
		} 
		if ((x==1||(y==1))) {// ||컬럼이라고 읽는다. or연산자 
			System.out.println("x는 1이거나 y2이다.");
		}
	}
}
