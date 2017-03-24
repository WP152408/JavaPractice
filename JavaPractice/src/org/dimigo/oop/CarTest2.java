/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *    l_ CarTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 23.
 * </pre>
 * 
 * @author : pengfox
 * @version : 1.0
 */
public class CarTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car2 blackCar = new Car2("현대", "제네시스", "검정", 225, 50000000);
		Car2 whiteCar = new Car2("기아", "K7", "흰", 246, 40000000);
		Car2 grayCar = new Car2("삼성", "SM7", "회", 200, 38000000);
		
		System.out.println("<< 자동차 목록 >>");
		
		
		System.out.printf("제조사명 : %s자동차%n모델명 : %s%n색상 : %s색%n최대속도 : %dkm%n가격 : %,d원%n%n",
				blackCar.getCompany(), blackCar.getModel(), blackCar.getColor(), blackCar.getMaxSpeed(), blackCar.getPrice());
		
		
		System.out.printf("제조사명 : %s자동차%n모델명 : %s%n색상 : %s색%n최대속도 : %dkm%n가격 : %,d원%n%n",
				whiteCar.getCompany(), whiteCar.getModel(), whiteCar.getColor(), whiteCar.getMaxSpeed(), whiteCar.getPrice());
		
		
		System.out.printf("제조사명 : %s자동차%n모델명 : %s%n색상 : %s색%n최대속도 : %dkm%n가격 : %,d원%n%n",
				grayCar.getCompany(), grayCar.getModel(), grayCar.getColor(), grayCar.getMaxSpeed(), grayCar.getPrice());
	}

}