/**
 * 
 */
package com.waheedtechblog.privatemethod;

/**
 * @author abdulwaheed18@gmail.com
 *
 */
public interface PrivateInterface {

	String message = "Welcome back";

	public abstract void method5();

	default void method1() {
		System.out.println("In Default method1");
		// static and non-static private method can be used inside non-static function
		commonMethod3(); // calling private method 3
		commonMethod4(); // calling private method 4
	}

	public static void method2() {
		System.out.println("In Default method2");
		commonMethod4();
	}

	private void commonMethod3() {
		System.out.println("In private method3");
	}

	private static void commonMethod4() {
		System.out.println("In private static method4");

	}

}
