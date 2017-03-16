/**
 * 
 */
package org.dimigo.basic;
import java.util.Scanner;
import java.util.Random;
/**
 * <pre>
 * org.dimigo.basic
 *    l_ Loop
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 15.
 * </pre>
 * 
 * @author : pengfox
 * @version : 1.0
 */
public class Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice, atk = 10;
		do {
			System.out.println("------------");
			System.out.println("<< 게임 메뉴 >>");
			System.out.println("1. 공격력 증가");
			System.out.println("2. 공격력 감소");
			System.out.println("3. 캐릭터 설정");
			System.out.println("9. 종료");
			choice = scan.nextInt();
			System.out.println("메뉴 입력 => " + choice);
			switch (choice) {
			case 1:
				System.out.println("공격력이 증가되었습니다. 현재 공격력 : " + (++atk) + "0");
				break;
			case 2:
				System.out.println("공격력이 감소되었습니다. 현재 공격력 : " + (--atk) + "0");
				break;
			case 3:
				String[] clst = {"영주", "농민", "마법사", "기사"};
				int clsn = new Random().nextInt(4);
				System.out.println(clst[clsn] + "(으)로 설정되었습니다.");
				break;
			case 9:
				scan.close();
				break;
			}
			System.out.printf("------------%n이제 공부하세요!");
		} while (choice != 9);
	}

}
