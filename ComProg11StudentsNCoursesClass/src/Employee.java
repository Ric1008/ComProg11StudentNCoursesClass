public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private double salary;
    static int plyeeNum=1 ;
    private int percent;

    Employee(){
        id=plyeeNum;
        plyeeNum++;
        firstName="Jade ";
        lastName="Doe ";
        salary=652 ;
    }

    Employee(String firstName, String lastName, double salary){
        id=plyeeNum;
        plyeeNum++;
        this.firstName=firstName;
        this.lastName=lastName;
        this.salary=salary;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getName(){
        return firstName+lastName;
    }
    public double getYearSalary(){
        return salary*12;
    }
    public void raisesalary(double percent){
        double decimalPercent=percent/100;
        double extramoney=salary*decimalPercent;
        salary=salary+extramoney;
    }
    public String toString(){
        return "\"Employee [ Salary: "+id+", name = "+firstName+lastName+", Salary = $"+salary+ " ]\"";
    }
}
