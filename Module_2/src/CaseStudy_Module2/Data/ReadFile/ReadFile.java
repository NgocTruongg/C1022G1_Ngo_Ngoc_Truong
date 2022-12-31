package CaseStudy_Module2.Data.ReadFile;

import CaseStudy_Module2.Models.Facility.Room;
import CaseStudy_Module2.Models.Facility.Villa;
import CaseStudy_Module2.Models.Person.Customer;
import CaseStudy_Module2.Models.Person.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ReadFile {

    public static List<Employee> readFileEmployee(String path) {
        List<Employee> employeeList = new ArrayList<>();
        File file = new File(path);
        BufferedReader bufferedReader = null;
        if (file.exists()) {
            try {
                FileReader fileReader = new FileReader(path);
                bufferedReader = new BufferedReader(fileReader);
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    String[] lineSplit = line.split(",");
                    Employee employee = new Employee(lineSplit[0],lineSplit[1],lineSplit[2],
                            lineSplit[3],lineSplit[4],lineSplit[5],lineSplit[6],lineSplit[7],lineSplit[8],
                            lineSplit[9]);
                    employeeList.add(employee);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } return employeeList;
    }


    public static List<Customer> readFileCustomer (String path) {
        List<Customer> customerList = new ArrayList<>();
        File file = new File(path);
        BufferedReader bufferedReader = null;
        if (file.exists()){
            try {
                FileReader fileReader = new FileReader(path);
                bufferedReader = new BufferedReader(fileReader);
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    String[] lineSplit = line.split(",");
                    Customer customer = new Customer(lineSplit[0],lineSplit[1],lineSplit[2],
                            lineSplit[3],lineSplit[4],lineSplit[5],lineSplit[6],lineSplit[7],lineSplit[8]);
                    customerList.add(customer);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }return customerList;
    }
    public static Map<Room, Integer> readFileRoom(String path) {
        Map<Room,Integer> roomIntegerMap = new LinkedHashMap<>();
        File file = new File(path);
        BufferedReader bufferedReader = null;
        if (file.exists()) {
            try {
                FileReader fileReader = new FileReader(path);
                bufferedReader = new BufferedReader(fileReader);
                String line;
                while ((line = bufferedReader.readLine()) != null){
                    String[] lineRoom = line.split(",");
                    Room room = new Room(lineRoom[0],lineRoom[1],lineRoom[2],
                            lineRoom[3],lineRoom[4],lineRoom[5]);
                    roomIntegerMap.put(room,0);
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }return roomIntegerMap;
    }

    public static Map<Villa,Integer> readFileVilla (String path) {
        Map<Villa,Integer> villaIntegerMap = new LinkedHashMap<>();
        File file = new File(path);
        BufferedReader bufferedReader = null;
        if (file.exists()) {
            try {
                FileReader fileReader = new FileReader(file);
                bufferedReader = new BufferedReader(fileReader);
                String line;
                while ((line = bufferedReader.readLine()) != null){
                    String[] lineVilla = line.split(",");
                    Villa villa = new Villa(lineVilla[0],lineVilla[1],lineVilla[2],
                            lineVilla[3],lineVilla[4],lineVilla[5],lineVilla[6],lineVilla[7]);
                    villaIntegerMap.put(villa,0);
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }return villaIntegerMap;
    }
}
