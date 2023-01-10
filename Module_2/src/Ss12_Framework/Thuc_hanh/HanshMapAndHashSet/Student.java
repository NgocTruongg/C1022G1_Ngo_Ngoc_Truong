package Ss12_Framework.Thuc_hanh.HanshMapAndHashSet;

public class  Student {
    private String name;
    private int age;
    private String address;

    public Student() {
    }

    public Student(String name, int age, String addres) {
        this.name = name;
        this.age = age;
        this.address = addres;
    }

    public Student(String truong, String đn) {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String addres) {
        this.address = addres;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
