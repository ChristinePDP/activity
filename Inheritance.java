public class Inheritance {
    public static void main(String[] args){

        System.out.println("STUDENT:");
        Student student1 = new Student("De Padua, Christine P.", "Brgy. Navotas Bal. Bats.", "BSIT", 2);
        System.out.println("Name: " + student1.getName());
        System.out.println("Address: " + student1.getAddress());
        System.out.println("Program: " + student1.getProgram());
        System.out.println("Year: " + student1.getYear());
        System.out.println();

        System.out.println("STAFF:");
        Staff staff1 = new Staff("Tine", "Brgy. Dalig Bal. Bats.", "BSU-Balayan", 12345.00);
        System.out.println("Name: " + staff1.getName());
        System.out.println("Address: " + staff1.getAddress());
        System.out.println("Program: " + staff1.getSchool());
        System.out.println("Year: " + staff1.getSalary());
    }

}

class Person{
    protected String Name;
    protected String Address;

    public void setName(String name){
        this.Name = name;
    }

    public void setAddress(String address){
        this.Address = address;
    }

    public String getName(){
        return this.Name;
    }

    public String getAddress(){
        return this.Address;
    }

}

class Student extends Person {
    private String Program;
    private Integer Year;

    public Student(String name, String address, String program, Integer year) {
        super();
        this.Name = name;
        this.Address = address;
        this.Program = program;
        this.Year = year;
    }

    public String getProgram() {
        return this.Program;
    }

    public Integer getYear() {
        return this.Year;
    }
}

class Staff extends Person{
    private String School;
    private Double Salary;

    public Staff(String name, String address, String school, Double salary){
        super();
        this.Name = name;
        this.Address = address;
        this.School = school;
        this.Salary = salary;
    }

    public void setSchool(String school){
        this.School = school;
    }

    public void setSalary(Double salary){
        this.Salary = salary;
    }

    public String getSchool(){
        return this.School;
    }

    public Double getSalary(){
        return this.Salary;
    }

}