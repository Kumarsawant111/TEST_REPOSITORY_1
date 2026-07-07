public class Employee{
    private String name;
    private int age;
    private String department;
   // Commeted Line 
   // This is parameterized constructor 
   // This is the Third comment Added 
    public Employee(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }
}