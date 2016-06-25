package a01;

import java.util.Scanner;
import java.util.ArrayList;

public class StudentApp {
	private static Scanner input = new Scanner(System.in);
	private static ArrayList<Student> students = new ArrayList<>();
	
	public static void main(String[] args) {		
		Student student1 = new Student ("Bryce", "Edwards", "CSIS", 3.8);
		Student student2 = new Student ("Steven", "Smith", "Education", 3.7);
		Student student3 = new Student ("Kyle", "Berger", "Sports", 2.5);
		students.add(student1);
		students.add(student2);
		students.add(student3);
		
		System.out.println();
		System.out.println();
		int selection = 0;
			
		do {
			menu();
			selection = input.nextInt();
			System.out.println();
			processSelection(selection);
			
		} while(selection != 6);
	}
		
	private static void menu() {
		System.out.println("1.  Add a student");
		System.out.println("2.  Find a student");
		System.out.println("3.  Delete a student");
		System.out.println("4.  Display all students");
		System.out.println("5.  Display the total number of students");
		System.out.println("6.  Exit");
		System.out.print("Enter your selection: ");
	}
	
	private static void processSelection(int selection) {
		switch(selection) {
		case 1:
			addStudent(students);
			break; 
		case 2:
			findStudent(students);
			break; 
		case 3:
			deleteStudent(students);
			break; 
		case 4:
			for (Student s : students) {
				System.out.printf("%s%n", s);
			}
			System.out.println();
			break;
		case 5:
			System.out.println("Number of Students: " + students.size());
			System.out.println();
			break; 
		case 6:
			System.out.println("Goodbye");
			break;
		default:
			System.out.println("Invalid Option, Please select option 1 - 6:");
			System.out.println();
		}
	}
	
	private static void addStudent(ArrayList<Student> studentList) {
		input = new Scanner(System.in);
		System.out.print("First Name: ");	
		String firstName = input.nextLine();
		System.out.print("Last Name: ");
		String lastName = input.nextLine();
		System.out.print("Major: ");
		String major = input.nextLine();
		System.out.print("gpa: ");
		double gpa = input.nextDouble();
		Student addedStudent = new Student (firstName, lastName, major, gpa);
		studentList.add(addedStudent);
		System.out.println();	
	}
	
	private static void findStudent(ArrayList<Student> studentList) {
		System.out.print("Find student with sNumber S");
		int sNumber = input.nextInt();
		boolean found = false;
		for (int i = 0; i < students.size(); i++) {				
			if (studentList.get(i).getsNumber() == sNumber) {
				System.out.printf("%s%n", studentList.get(i).toString());
				found = true;
				break;
			} 
		}
		if (found == false) {
			System.out.println("Student could not be found.");
		}
		System.out.println();
	}
	
	private static void deleteStudent(ArrayList<Student> studentList) {
		System.out.print("Delete student with sNumber S");
		int deleteStudentID = input.nextInt();
		boolean found = false;
						
		for (int i = 0; i < studentList.size(); i++) {					
			if (studentList.get(i).getsNumber() == deleteStudentID) {
				System.out.println( "" + studentList.get(i).getsNumber() + " " +
						studentList.get(i).getFirstName() + " " +
						studentList.get(i).getLastName() + 
						" has been deleted.");
				studentList.remove(i);
				found = true;
				break;
			}
		}
		if (found == false) {
			System.out.println("Student could not be found.");
		}
		
		System.out.println();
	}		
}