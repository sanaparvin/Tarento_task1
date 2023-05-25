class Employee{
    float salary=40000;
}
class Programmer extends Employee {
    int bonus = 10000;
}
class Designer extends Employee{
    int bonus=5000;
}
public class main {
    public static void main(String[] args) {
        Programmer p = new Programmer();
        Designer d = new Designer();
        System.out.println("The Total salary and bonus of the programmer is: " +(p.salary+p.bonus));
        System.out.println("The Total salary and bonus of the Designer is: " + (d.salary+d.bonus));
    }
}