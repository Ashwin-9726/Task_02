// 1.1)create a class person

public class Person {
    String name;
    int age;
   //Default Constructor
    Person(){

    }
    //Parameterized Constructor with default age
    Person(String name){
        this.age=18;
        this.name=name;
    }
    //parameterized Constructor to initialize age and name
    Person(int age,String name){
        this.age=age;
        this.name=name;
    }
    //Getter and Setter Methods
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Person_Main {
    public static void main(String[] args) {
        Person p =new Person(20,"Ashwin");
        System.out.print(p.getName()+" "+p.getAge());

    }
}

