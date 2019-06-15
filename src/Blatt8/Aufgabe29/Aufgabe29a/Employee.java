package Blatt8.Aufgabe29.Aufgabe29a;

import Blatt4.Aufgabe14.IllegalInputException;

import java.util.ArrayList;

public class Employee {

    private ArrayList<Employee> staff;

    public Employee() {
        staff = new ArrayList<>();
    }

    public void linkStaff(Employee staff) throws IllegalInputException {
        if(checkStaff(staff)) {
            this.staff.add(staff);
        } else {
            throw new IllegalInputException("Staff already exists", staff.toString());
        }
    }

    public void unlinkStaff(Employee staff) {
        if(this.staff.contains(staff)) {
            this.staff.remove(staff);
        }
    }

    public ArrayList<Employee> getlinkStaff() {
        return staff;
    }

    private boolean checkStaff(Employee newStaff) {
        return !staff.contains(newStaff);
    }

}
