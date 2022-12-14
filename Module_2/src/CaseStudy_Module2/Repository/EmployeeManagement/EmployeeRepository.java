package CaseStudy_Module2.Repository.EmployeeManagement;

import CaseStudy_Module2.Data.ReadFile.ReadFile;
import CaseStudy_Module2.Data.WriteFile.WriteFile;
import CaseStudy_Module2.Models.Person.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    public static List<Employee> employeeList = new ArrayList<>();
    public static final String PATH_EMPLOYEE = "src\\CaseStudy_Module2\\Data\\FileCSV\\employee.csv";

    static {
        employeeList.add(new Employee("NV-1", "Đạt", "26/9/1999",
                "Nam", "191965434", "0971964814",
                "Đạt@gmail.com", "12/ĐH", "Guard", "5000000"));
        employeeList.add(new Employee("NV-2", "Trường", "10/9/1998",
                "Nam", "197366689", "0378730129",
                "Trường@gmail.com", "12/ĐH", "Director ", "15000000"));
        employeeList.add(new Employee("NV-3", "Phong", "8/6/1997",
                "Nam", "178263495", "0947218542",
                "Phong@gmail.com", "12/ĐH", "Manage", "8000000"));
    }


    public void writeFile(List<Employee> employeeList) {
        WriteFile.writeFileEmployee(PATH_EMPLOYEE, employeeList);
    }

    @Override
    public void display() {
        employeeList = ReadFile.readFileEmployee(PATH_EMPLOYEE);
        for (Employee c : employeeList) {
            System.out.println(c);
        }
    }

    @Override
    public void add(Employee employee) {
        employeeList = ReadFile.readFileEmployee(PATH_EMPLOYEE);
        employeeList.add(employee);
        writeFile(employeeList);

    }

    @Override
    public void deleteId(String id) {
        employeeList = ReadFile.readFileEmployee(PATH_EMPLOYEE);
        int index = -1;
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId().equals(id)) {
                index = i;
                break;
            }
        }
        employeeList.remove(index);
        writeFile(employeeList);
        /// ???
    }


    @Override
    public Employee finById(String id) {
        employeeList = ReadFile.readFileEmployee(PATH_EMPLOYEE);
        for (Employee c : employeeList) {
            if (c.getId().equals(id)) {
                return c;
            }
        }
        return null;
    }

    @Override
    public void edit(Employee employee) {
        employeeList = ReadFile.readFileEmployee(PATH_EMPLOYEE);
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId().equals(employee.getId())) {
                employeeList.set(i, employee);
            }
        }
        writeFile(employeeList);
    }
}
