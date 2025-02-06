
public class Employee
{
    String name="";
    String desig="";
    int salary=0;
    double bonus=0;
    Employee(String name,String desig,int salary)
    {
        this.name=name;
        this.desig=desig;
        this.salary=salary;
        calculate(salary);
    }

    protected void calculate(int salary)
    {
        if(salary>30000)
        {
            bonus=0.2*salary;
        }
        else if(salary>20000 && salary<30000)
        {
            bonus=0.3*salary;
        }
        else if(salary<20000)
        {
            bonus=0.4*salary;
        }
        display();
    }

    private void display()
    {
        System.out.println("Name is "+name);
        System.out.println("Designation is "+desig);
        System.out.println("Salary is "+salary);
        System.out.println("Bonus is "+bonus);
    }
}
