// 1.4)Create a sub class Employee from person

 public class Employee extends Person{
 int employeeID;
 double salary;
    //Default Constructor
    Employee(){

    }
    //Parameterized Constructor
    Employee(int age,String name,int employeeID,double salary){
        //Calling parent constructor using super keyword
        super(age,name);
        this.employeeID=employeeID;
        this.salary=salary;
    }
}
class Employee_Main {
    public static void main(String[] args) {
        Employee emp =new Employee(21,"RAM",121,20000);
        System.out.println("Name "+emp.name+"  Age "+emp.age+"   ID "+emp.employeeID+"   Salary  "+emp.salary);
    }
}