package Assignment4;

import java.util.HashMap;
import java.util.Map;

class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee ID: " + id + ", Name: " + name;
    }
}

public class Task2 {
    private Map<Integer, Employee> employees = new HashMap<>();

    public void addEmployee(String name, int id) {
        employees.put(id, new Employee(name, id));
        System.out.println("Employee added: " + name);
    }

    public Employee getEmployee(int id) {
        return employees.get(id);
    }

    public void displayAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees to display.");
        } else {
            for (Employee employee : employees.values()) {
                System.out.println(employee);
            }
        }
    }

    public static void main(String[] args) {
        Task2 manager = new Task2();
        manager.addEmployee("John", 101);
        manager.addEmployee("Jane", 102);
        System.out.println("Retrieved Employee: " + manager.getEmployee(101));
        manager.displayAllEmployees();
    }
}
