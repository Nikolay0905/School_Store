package Objects;

public class Employee {

    private String Name;
    private short Age;
    private String EGN;
    private int Experience;
    private String Education;
    private float Salary;
    private String restaurantId;

    public Employee(String name, String egn, short age, int experience, float salary , String education,String restaurantId) {
        this.Name = name;
        this.Age = age;
        this.EGN = egn;
        this.Experience = experience;
        this.Education = education;
        this.Salary = salary;
        this.restaurantId = restaurantId;
    }

    public String getName() {
        return Name;
    }
    public String getEGN() {
        return EGN;
    }

}
