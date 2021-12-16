package week_8;

public class Employee {

    public String name,jobTitle;
    public int ID;
    public double salary;// instance variable. they have their own values
    // variable Types: (local variable, instance variable: each object has its own copy
    //static: every object has same value

    public static String companyName = "Microsoft";  // static variable,same copy for all my objects

    public Employee(String name, String jobTitle, int ID, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.ID = ID;
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", ID=" + ID +
                ", salary=" + salary +
                '}';
    }
}


