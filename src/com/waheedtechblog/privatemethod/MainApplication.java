/**
 * 
 */
package com.waheedtechblog.privatemethod;

/**
 * @author abdul
 *
 */
public class MainApplication implements PrivateInterface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MainApplication application = new MainApplication();

		// calling default method of static
		application.method1();

		// calling static method of Interface
		PrivateInterface.method2();

		// calling class method
		application.method5();

	}

	@Override
	public void method5() {
		System.out.println("In abstract method 5");

	}

}
