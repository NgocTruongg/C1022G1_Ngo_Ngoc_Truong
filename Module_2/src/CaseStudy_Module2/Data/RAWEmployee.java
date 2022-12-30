//package CaseStudy_Module2.Data;
//
//import CaseStudy_Module2.Models.Person.Employee;
//
//import java.io.BufferedReader;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//public class RAWEmployee {
//
//
//    public static final String FILE_EMPLOYEE_CSV = "src\\CaseStudy_Module2\\Data\\employee.csv";
//
//    public List<Employee> readEmployeeCSV() {
//        List<Employee> employeeList = new ArrayList<>();
//        BufferedReader bufferedReader = null;
//        try {
//            bufferedReader = new BufferedReader(new FileReader(FILE_EMPLOYEE_CSV));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        String [] temp;
//        String line;
//        Employee employee;
//        try {
//            while ((line = bufferedReader.readLine()) != null) {
//                temp = line.split(",");
//                String fullName =temp[0];
//                String dateOfBirthday = temp[1];
//                String sex =temp[2];
////                String dateOfBirthday = temp[1];
////                String fullName =temp[0];
////                String dateOfBirthday = temp[1];
////                String fullName =temp[0];
////                String dateOfBirthday = temp[1];
////                String fullName =temp[0];
////                String dateOfBirthday = temp[1];
////                String fullName =temp[0];
////                String dateOfBirthday = temp[1];
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
