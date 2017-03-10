/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *    l_ PrimitiveDataType
 * 
 * 1. 개요 : 아이유 프로필 출력하기
 * 2. 작성일 : 2017. 3. 9.
 * </pre>
 * 
 * @author : pengfox
 * @version : 1.0
 */
public class PrimitiveDataType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "아이유";
		boolean isMale = false;
		int age = 25;
		double height = 161.8;
		float weight = 44.3f;
		char bloodType = 'A';
		System.out.printf("<< 아이유 프로필 >>%n이름 : %s%n성별 : %s%n나이 : %d세%n키 : %.1fcm%n"
				+ "몸무게 : %.1fkg%n혈액형 : %c형", name, (isMale ? "남자" : "여자"), age, height, weight, bloodType);
	}

}
