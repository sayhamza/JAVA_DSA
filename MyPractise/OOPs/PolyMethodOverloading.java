// Java program to demonstrate the working of method
// overloading by changing the number of parameters
package MyPractise.OOPs;
public class PolyMethodOverloading {
	
	// 1 parameter
	void show(int num1)
	{
		System.out.println("number 1 : " + num1);
	}

	// 2 parameter
	void show(int num1, int num2)
	{
		System.out.println("number 1 : " + num1
						+ " number 2 : " + num2);
	}

	public static void main(String[] args)
	{
		PolyMethodOverloading obj = new PolyMethodOverloading();
	
		// 1st show function
		obj.show(3);
	
		// 2nd show function
		obj.show(4);
		obj.show(4, 5);
	}
}
