/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception
 *    l_ movieTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 31.
 * </pre>
 * 
 * @author : pengfox
 * @version : 1.0
 */
public class movieTest {
	public static void main(String[] args) {
		int age = 13;
		Movie[] movies = {
				new Movie("에이리언:커버넌트", 15),
				new Movie("가디언즈 오브 갤럭시", 12)
		};
		for(Movie movie : movies) {
			try {
				movie.buyTicket(age);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
