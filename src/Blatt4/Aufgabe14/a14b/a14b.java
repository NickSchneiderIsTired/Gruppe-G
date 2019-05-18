package Blatt4.Aufgabe14.a14b;

import Blatt4.Aufgabe14.Employee;
import Blatt4.Aufgabe14.IllegalInputException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.TreeSet;

public class a14b {
    public static void main(String[] args) {
        Random r = new Random();
        TreeSet<Employee> list = new TreeSet<>((o1, o2) -> {
            if(o1.getId() > o2.getId()) {
                return 1;
            } else if (o1.getId() < o2.getId()){
                return -1;
            } else{
                return 0;
            }
        });

        int emps = args.length / 2;
        if(emps * 2 != args.length) {
            System.out.println("Eingabe inkorrekt");
            return;
        }

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        for(int i = 0; i < emps; i++) {
            LocalDate newDate = LocalDate.parse(args[2 * i + 1], dateTimeFormatter);
            try {
                Employee nE = new Employee(r.nextInt(10) + 1001, args[2 * i], newDate);
                for(Employee e : list) {
                    if(e.equals(nE)) {
                        System.out.println("Employee already exists");
                        return;
                    }
                }
                list.add(nE);

            } catch(IllegalInputException | IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        list.stream().forEach(System.out::println);
    }
}
