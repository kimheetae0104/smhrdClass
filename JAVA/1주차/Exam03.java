import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		// 윤년이란 2월에 29일이 있는 날을 말한다.
//		4의 배수이면서 100의 배수가 아닐 때는 윤년이다.
//		400의 배수일 때 윤년이다.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("년도 입력 >> ");
		int year = sc.nextInt();
		if (year % 4 == 0 && year % 100 != 0) {
			System.out.println(year + "윤년");
		}else if(year % 400 == 0) {
			System.out.println(year + " 윤년");
		}else {
			System.out.println("윤년 아님");
		}
	}

}
