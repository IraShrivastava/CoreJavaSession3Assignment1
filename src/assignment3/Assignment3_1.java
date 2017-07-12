package assignment3;
public class Assignment3_1 {

    // salary  variable is a private static variable
	private static double salary = 1000;

	// this instance variable is visible for any child class.
	public String name;



	// The name variable is assigned in the constructor.
	public Assignment3_1 (String empName) 
	{
		name = empName;
	}



	// This method prints the employee details.
	public void printEmp() 
	{
		System.out.println("name  : " + name );
		System.out.println("salary :" + salary);
	}

	public static void main(String args[]) 
	{
		Assignment3_1 empOne = new Assignment3_1("Ransika");
		empOne.printEmp();
		Assignment3_1 empTwo = new Assignment3_1("Ram");
		empTwo.printEmp();
	}
}
