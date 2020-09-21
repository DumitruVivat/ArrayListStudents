package main;

import java.util.ArrayList;

import data.Student;

public class StudentApp {

	public static void main(String[] args) {

		ArrayList<Student> students = new ArrayList<Student>();
		
//		Object obj = new Object();
		
		students.add( new Student("Tatiana Annat","IT",9.0f) );
		students.add( new Student("Sergiu Smochina","FF",6.5f) );
		students.add( new Student("Teodor Ciobanu","PA",9.9f) );
		students.add( new Student("Ana Arama","FM",8.5f) );
		students.add( new Student("Eva Sorocean","LS",9.5f) );
		
		int indexOfTheBest = 0;
        // using iterator to find index of the best student
        for (int i = 0; i < students.size();i++) {
			if(students.get(indexOfTheBest).getGrade() < students.get(i).getGrade()) {
				indexOfTheBest = i;
			}
		}
        System.out.println("Index of best student -> " + indexOfTheBest + "\n");
        
    	// adding 0.1 to grade of the best student.
		students.get(indexOfTheBest).setGrade(students.get(indexOfTheBest).getGrade()+0.1f);
		System.out.println("Grade of the best student -> : " + students.get(indexOfTheBest).getGrade()+ "\n");
		
		//List of students
		System.out.println("###################Students###################\n");
		for (Student student : students) {
			System.out.println(student);
		}
		// creating new list of best students.
		ArrayList<Student> bestStudents = new ArrayList<Student>();
		
		//adding best students.
		for (int i = 0; i < students.size(); i++) {
			if( students.get(i).getGrade() > 8.0f) {
				bestStudents.add(students.get(i));
			}
		}
		System.out.println("\n#################BestStudents#################\n");
    	for (Student student : bestStudents) {
			System.out.println(student);
		}
		
	}

}
