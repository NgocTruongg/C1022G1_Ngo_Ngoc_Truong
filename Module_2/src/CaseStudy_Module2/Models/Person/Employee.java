package CaseStudy_Module2.Models.Person;

public class Employee extends Person {
    private String level;
    private String position;
    private String  salary;

    public Employee() {
    }

    public Employee(String id, String name, String dateBirth, String sex, String cMND, String numberPhone, String email,
                    String level, String position, String salary) {
        super(id, name, dateBirth, sex, cMND, numberPhone, email);
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
    public String convertLine() {
        String COMMA = ",";
        return this.level + COMMA + super.convertLine() + COMMA +this.position + COMMA + this.salary;
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString() +
                "level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
