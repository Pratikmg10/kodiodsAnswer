package Coding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentList {

	 public static void main(String[] args) {
	        ArrayList<Student> students = new ArrayList<>();

	        // Adding some students to the list
	        students.add(new Student("1", "Jack", 70));
	        students.add(new Student("2", "Jany", 59));
	        students.add(new Student("3", "Charlie", 80));
	        students.add(new Student("4", "Rock", 87));

	        // Sorting the list in descending order based on marks
	        Collections.sort(students, new Comparator<Student>() {
	            @Override
	            public int compare(Student s1, Student s2) {
	                return Integer.compare(s2.getMarks(), s1.getMarks());
	            }
	        });

	        //sorted list
	        System.out.println("Students sorted by marks in descending order:");
	        for (Student student : students) {
	            System.out.println(student);
	        }
	    }
}
