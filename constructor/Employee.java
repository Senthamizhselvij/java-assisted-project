
package constructor;

public class Employee {

	int empId;

	String empName;

	String department;

	float salary;

	

	//default constructor

	public Employee() {

		empId=5;

		empName="Emp001";

		department="finance";

		salary=45000;

	}

	

	//parameterized constructor

	public Employee(int empId,String empName,String department,float salary) {

		this.empId=empId;

		this.empName=empName;

		this.department=department;

		this.salary=salary;

	}

	

	public void display() {

		System.out.println("Id: "+empId);

		System.out.println("Name: "+empName);

		System.out.println("Department: "+department);

		System.out.println("Salary: "+salary);

		System.out.println();

		

	}

	

	public static void main(String[] args) {

		

		Employee e= new Employee();

		Employee e1= new Employee(18, "tamil", "Training", 464500); 



		//calling default constructor

		e.display();

		//parameterized constructor

		e1.display();

		

		 

	

	}



	
}
