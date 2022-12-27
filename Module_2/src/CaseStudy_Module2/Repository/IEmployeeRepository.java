package CaseStudy_Module2.Repository;

import CaseStudy_Module2.Models.Person.Employee;

public interface IEmployeeRepository {

    void display();
    void add (Employee employee);
    void deleteId (String employee);
    Employee finById (String id);
    void edit (Employee employee);

}
