package CaseStudy_Module2.Models.Person;

import java.util.Collections;

public abstract class Person {
    private String id;
    private String name;
    private String dateBirth;
    private String sex;
    private String cMND;
    private String numberPhone;
    private String email;

    public Person() {
    }

    public Person(String id, String name, String dateBirth, String sex, String cMND, String numberPhone, String email) {
        this.id = id;
        this.name = name;
        this.dateBirth = dateBirth;
        this.sex = sex;
        this.cMND = cMND;
        this.numberPhone = numberPhone;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getcMND() {
        return cMND;
    }

    public void setcMND(String cMND) {
        this.cMND = cMND;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateBirth='" + dateBirth + '\'' +
                ", sex='" + sex + '\'' +
                ", cMND='" + cMND + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    protected  String convertLine(){
        String COMMA = ",";
        return this.id + COMMA + this.name + COMMA + this.dateBirth + COMMA +this.sex + COMMA +
                this.cMND + COMMA + this.numberPhone +COMMA + this.email;
    }
}
