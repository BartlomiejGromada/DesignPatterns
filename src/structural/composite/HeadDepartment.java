package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class HeadDepartment implements Department {

    private String name;
    private List<Department> departments;

    public HeadDepartment(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        System.out.println("Add department.");
        this.departments.add(department);
    }

    public void removeDepartment(Department department) {
        System.out.println("Remove department.");
        this.departments.remove(department);
    }

    @Override
    public void printInfo() {
        System.out.println(this + " -> All department:");
        departments.forEach(Department::printInfo);
    }

    @Override
    public String toString() {
        return "HeadDepartment: " + name;
    }
}