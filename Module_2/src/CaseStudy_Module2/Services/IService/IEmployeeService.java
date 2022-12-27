package CaseStudy_Module2.Services.IService;

import CaseStudy_Module2.Models.Person.Employee;

public interface IEmployeeService {
    void display();
    void add (Employee employee);
    void deleteId (String employee);
    Employee finById (String id);
    void edit (Employee employee);


}
