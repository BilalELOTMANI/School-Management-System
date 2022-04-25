package School.Management.System;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		
		Teacher Amine = new Teacher(1, "Amine", 15000);
		Teacher Ahmed = new Teacher(2, "Ahmed", 25000);
		Teacher Aya = new Teacher(3, "Aya", 35000);
		Teacher Bilal = new Teacher(4, "Bilal", 450700);
		
		List<Teacher> teachersList = new ArrayList<>();
		teachersList.add(Amine);
		teachersList.add(Ahmed);
		teachersList.add(Aya);
		teachersList.add(Bilal);

		
		Student Hayat = new Student(1, "Hayat", 5);
		Student Manal = new Student(2, "Manal", 6);
		Student Meryem = new Student(1, "Meryem", 4);
		Student Wafae = new Student(1, "Wafae", 8);
		Student Malak = new Student(1, "Malak", 4);
		
		List<Student> studentsList = new ArrayList<>();
		studentsList.add(Hayat);
		studentsList.add(Manal);
		studentsList.add(Meryem);
		studentsList.add(Wafae);
		studentsList.add(Malak);

		
		School EMI = new School(teachersList, studentsList);
		
		Teacher Hamza = new Teacher(5, "Hamza", 500000);
		EMI.addTeacher(Hamza);

		
		Malak.paysFees(7000);
		Manal.paysFees(3000);
		System.out.println("EMI has earned " + EMI.getTotalMoneyEarned());
		
	    Bilal.receiveSalary(523600);
	    Bilal.receiveSalary(500000);

		
	    System.out.println(Bilal.toString());
	    
		



	}

}
