package Coding;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
		 private String role;
		 private String name;
		 private int marks;

		    // Using Constructor
		    public Student(String role, String name, int marks) {
		        this.role = role;
		        this.name = name;
		        this.marks = marks;
		    }

		    // Using Getters Method
		    public String getRole() {
		        return role;
		    }

		    public String getName() {
		        return name;
		    }

		    public int getMarks() {
		        return marks;
		    }

		    @Override
		    public String toString() {
		        return "Student{" +
		                "role='" + role + '\'' +
		                ", name='" + name + '\'' +
		                ", marks=" + marks +
		                '}';
		    }
		}

