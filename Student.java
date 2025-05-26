package com.student;

import com.school1.School;

public class Student {
	
		private String studentName;
		private String grade;
		private School school;
		private double averageMarks;
		
		private Student(String studentName, String grade, School school, double averageMarks) {
			this.studentName = studentName;
			this.grade = grade;
			this.school = school;
			this.averageMarks = averageMarks;
		}

		public String getstudentName() {
			return studentName;
		}

		public void setstudentName(String studentName) {
			this.studentName = studentName;
		}

		public String getGrade() {
			return grade;
		}

		public void setGrade(String grade) {
			this.grade = grade;
		}

		public School getSchool() {
			return school;
		}

		public void setSchool(School school) {
			if(school==null) {
				this.school=null;
			}else {
			this.school = school;
		}
		}
		
		public double getAverageMarks() {
			return averageMarks;
		}
		
		public void setAverageMarks(double averageMarks) {
			if(averageMarks<0 || averageMarks>100) {
		    this.averageMarks = 0.0;
		}else {
			this.averageMarks = averageMarks;
		}
		}
		
		public String toString() {
			return "Student [studentName=" + studentName + ", grade=" + grade + ", school=" + school + ", averageMarks="
					+ averageMarks + "]";
		}

		public static Student getStudentObject(String schoolName, String grade, School school, double averageMarks) {
			return new Student(schoolName, grade, school, averageMarks);
		}

	}
