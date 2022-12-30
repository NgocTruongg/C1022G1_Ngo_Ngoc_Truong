package CaseStudy_Module2.Repository.EmployeeManagement;

import CaseStudy_Module2.Models.Person.Employee;

public interface IEmployeeRepository {

    void display();
    void add (Employee employee);
    void deleteId (String id);
    Employee finById (String id);
    void edit (Employee employee);

}
