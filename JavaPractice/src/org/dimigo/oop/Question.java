/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *    l_ Question
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 31.
 * </pre>
 * 
 * @author : pengfox
 * @version : 1.0
 */
public class Question {

	public static void main(String[] args) {
	String[] questions = {"가수는", "배우는", "과목은"};
	String[] answers = {"아이유", "러셀 크로우", "응용 프로그래밍"};
	
	Scanner scanner  = new Scanner(System.in);
	
	for(int i = 0; i < 3; i ++) {
		System.out.println((i + 1) + ". 가장 좋아하는 " + questions[i] + "?");
		System.out.println(scanner.nextLine().equals(answers[i]) ? "정답입니다!" : "틀렸습니다!");
	}
	scanner.close();
	System.out.println("<< 결과 출력 >>");
	for(int i = 0; i < 3; i ++)
		System.out.println(new StringBuilder("가장 좋아하는 " + questions[i] + " " + answers[i] + "입니다."));

	}

}
