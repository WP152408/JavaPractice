/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *    l_ FamilyMember
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 4. 18.
 * </pre>
 * 
 * @author : pengfox
 * @version : 1.0
 */
public class FamilyMember {
	private static int memberCnt = 0;
	private String memberName = "";
	
	public FamilyMember() {
	}
	
	public FamilyMember(String memberName) {
		this.memberName = memberName;
		FamilyMember.memberCnt ++;
	}
	
	public String getMemberName() {
		return this.memberName;
	}
	public static void printMemberCnt() {
		System.out.println("가족 총 인원 수 : " + FamilyMember.memberCnt + "명");
	}
}
