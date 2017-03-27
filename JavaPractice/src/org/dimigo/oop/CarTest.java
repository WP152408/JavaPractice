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
public class CarTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car blackCar = new Car();
		Car whiteCar = new Car();
		Car grayCar = new Car();
		
		System.out.println("<< 자동차 목록 >>");
		
		blackCar.setCompany("현대");
		blackCar.setModel("제네시스");
		blackCar.setColor("검정");
		blackCar.setMaxSpeed(225);
		blackCar.setPrice(50000000);
		
		System.out.printf("제조사명 : %s자동차%n모델명 : %s%n색상 : %s색%n최대속도 : %dkm%n가격 : %,d원%n%n",
				blackCar.getCompany(), blackCar.getModel(), blackCar.getColor(), blackCar.getMaxSpeed(), blackCar.getPrice());
		
		whiteCar.setCompany("기아");
		whiteCar.setModel("K7");
		whiteCar.setColor("흰");
		whiteCar.setMaxSpeed(246);
		whiteCar.setPrice(40000000);
		
		System.out.printf("제조사명 : %s자동차%n모델명 : %s%n색상 : %s색%n최대속도 : %dkm%n가격 : %,d원%n%n",
				whiteCar.getCompany(), whiteCar.getModel(), whiteCar.getColor(), whiteCar.getMaxSpeed(), whiteCar.getPrice());
		
		grayCar.setCompany("삼성");
		grayCar.setModel("SM7");
		grayCar.setColor("회");
		grayCar.setMaxSpeed(200);
		grayCar.setPrice(38000000);
		
		System.out.printf("제조사명 : %s자동차%n모델명 : %s%n색상 : %s색%n최대속도 : %dkm%n가격 : %,d원%n%n",
				grayCar.getCompany(), grayCar.getModel(), grayCar.getColor(), grayCar.getMaxSpeed(), grayCar.getPrice());
	}
}