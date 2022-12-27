package CaseStudy_Module2.Services.service;

import CaseStudy_Module2.Models.Person.Employee;
import CaseStudy_Module2.Repository.EmployeeRepository;
import CaseStudy_Module2.Repository.IEmployeeRepository;
import CaseStudy_Module2.Services.IService.IEmployeeService;

public class EmployeeServiceImpl implements IEmployeeService {
    IEmployeeRepository iEmployeeRepository = new EmployeeRepository();

    @Override
    public void display() {
        iEmployeeRepository.display();
    }

    @Override
    public void add(Employee employee) {
        iEmployeeRepository.add(employee);

    }

    @Override
    public void deleteId(String employee) {
         iEmployeeRepository.deleteId(employee);
    }

    @Override
    public Employee finById(String id) {
        return iEmployeeRepository.finById(id);
    }


    @Override
    public void edit(Employee employee) {
        iEmployeeRepository.edit(employee);
    }


}
