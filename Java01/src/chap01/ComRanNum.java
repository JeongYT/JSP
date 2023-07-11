package chap01;

import java.util.*;

public class ComRanNum {

	public static void main(String[] args) {
		// int randomNum = (((int)Math.random()*100)+1);
		int randomNum = (int)((Math.random()*100)+1);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("컴퓨터가 1부터 100사이의 하나의 정수를 선택했습니다.");
		System.out.println("***** 컴퓨터가 선택한 수를 맞춰 보세요 *****");
		System.out.println("--------------------------------------------");
		
		int count = 0;
		while(true) {
			System.out.print("1부터 100사이의 값을 입력하세요 : ");
			int selectNo = scanner.nextInt();
			
			if(randomNum > selectNo) {
				System.out.println("더 큰수를 입력하세요.");
				count++;
			} else if (randomNum < selectNo) {
				System.out.println("더 작은수를 입력하세요.");
				count++;
			} else if (randomNum == selectNo) {
				System.out.println("컴퓨터가 선택한 수를 맞췄습니다.");
				count++;
				System.out.println("시도 횟수는 " + count + "번입니다.");
				break;
			}
		}

	}

}
