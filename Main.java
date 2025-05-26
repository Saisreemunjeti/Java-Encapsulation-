package com.main1;

import com.school1.School;
import com.student.Student;

public class Main {
	public static void main(String[] args) {
			
			School schoolObject=School.getSchoolObject("KHS","Bapunagar","Dedication, Determination, Discpline");
			Student studentObject=Student.getStudentObject("Saisree", "A",schoolObject, 99);
			System.out.println(studentObject);
			if( schoolObject==null) {
				System.out.println("Invalid School details/Student Details");
			}
	}

}
