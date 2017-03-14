/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *    l_ Operator
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 14.
 * </pre>
 * 
 * @author : pengfox
 * @version : 1.0
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long m = 1700000, n = 3, j = 1500;
		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.printf("월 평균 급여 : %,d원%n점포 내 직원 수 : %d명%n점포 수 : %,d개%n", m, n, j);
		System.out.printf("연간 인건비 : %,d원", m*n*j*12);
	}

}

