// 이클립스 임포트 단축키: ctrl + shift + m
package mashinda.calendar;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		//입력: 키보드로 두 수의 입력을 받는다.
		Scanner s = new Scanner(System.in);	// Scanner 객체
		int a,b;

		System.out.println("두 수를 입력하세요. ");
		a = s.nextInt();
		b = s.nextInt();
//		System.out.println("두 수의 합은 " + (a+b) + "입니다.");
		//출력: 화면에 두 수의 합을 출력한다.
		System.out.printf("두 수의 합은 %d입니다.", a+b);
		s.close();
	}
}
