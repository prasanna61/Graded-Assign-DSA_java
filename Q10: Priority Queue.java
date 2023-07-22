import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;
/*
 * Create the Student and Priorities classes here.
 */
 class Student implements Comparable < Student > { 
     private int id; private String name; 
 private double cgpa;
 public Student(int id, String name, double cgpa) {
    this.id = id;
    this.name = name;
    this.cgpa = cgpa;
}

@Override
public int compareTo(Student other) {
    if (this.cgpa != other.cgpa) {
        return Double.compare(other.cgpa, this.cgpa);
    } else if (!(this.name.equals(other.name))) {
        return this.name.compareTo(other.name);
    } else {
        return this.id - other.id;
    }
}

public int getID() {
    return id;
}

public String getName() {
    return name;
}

public double getCGPA() {
    return cgpa;
}
 }
class Priorities { 
    public List < Student > getStudents(List < String > events) { 
        PriorityQueue < Student > queue = new PriorityQueue < > ();

    for (String each: events) {
        String[] arr = each.split(" ");
        String type = arr[0];

        if (type.equalsIgnoreCase("ENTER")) {
            String name = arr[1];
            double cgpa = Double.parseDouble(arr[2]);
            int id = Integer.parseInt(arr[3]);

            queue.add(new Student(id, name, cgpa));

        } else if (type.equalsIgnoreCase("SERVED")) {
            queue.poll();
        }
    }

    List < Student > students = new ArrayList < > ();

    while (!queue.isEmpty()) {
        students.add(queue.poll());
    }

    return students;
}
}


public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}
