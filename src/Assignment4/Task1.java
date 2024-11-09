package Assignment4;

import java.util.ArrayList;

class Student {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student ID: " + id + ", Name: " + name;
    }
}

public class Task1 {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(String name, int id) {
        students.add(new Student(name, id));
        System.out.println("Student added: " + name);
    }

    public void removeStudent(int id) {
        students.removeIf(student -> student.getId() == id);
        System.out.println("Student with ID " + id + " removed.");
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    public static void main(String[] args) {
        Task1 manager = new Task1();
        manager.addStudent("Alice", 1);
        manager.addStudent("Bob", 2);
        manager.displayStudents();
        manager.removeStudent(1);
        manager.displayStudents();
    }
}