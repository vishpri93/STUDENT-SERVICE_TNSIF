package com.tns.sampleproject;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class StudentEntity {

		@Id
		@Column(name="studentID")
		private int studentID;
		
		@Column(name="firstName")
		private String firstName;
		
		@Column(name="lastName")
		private String lastName;
		
		@Column(name="college")
		private String college;
		
		@Column(name="rollNo")
		private long  rollNo;
		
		@Column(name="qualification")
		private String qualification;
		
		@Column(name="course")
		private String course;
		
		@Column(name="year")
		private int year;
		
		@Column(name="certificate")
		private String certificate;
		
		@Column(name="hallticketNo")
		private int hallticketNo;

		public int getEmployeeID() {
			return studentID;
		}

		public void setStudentID(int studentID) {
			this.studentID = studentID;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public long getRollNo() {
			return rollNo;
		}

		public void setRollNo(long rollNo) {
			this.rollNo = rollNo;
		}

		public String getQualification() {
			return qualification;
		}

		public void setQualification(String qualification) {
			this.qualification = qualification;
		}

		public String getCourse() {
			return course;
		}

		public void setCourse(String course) {
			this.course = course;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

		public String getCertificate() {
			return certificate;
		}

		public void setCertificate(String certificate) {
			this.certificate = certificate;
		}

		public int getHallTicketNo() {
			return hallticketNo;
		}

		public void setHallTicketNo(int hallticketNo) {
			this.hallticketNo = hallticketNo;
		}
		
		
		public StudentEntity() {
			super();
			// TODO Auto-generated constructor stub
		}

		public StudentEntity(int studentID, String firstName, String lastName, long rollNo, String qualification, String course,int year, String certificate,int hallticketNo) {
			super();
			this.studentID = studentID;
			this.firstName = firstName;
			this.lastName = lastName;
			this.rollNo = rollNo;
			this.qualification = qualification;
			this.course = course;
			this.year = year;
			this.certificate = certificate;
			this.hallticketNo = hallticketNo;
		}

		@Override
		public String toString() {
			return "Student [studentID=" + studentID + ", firstName=" + firstName + ", lastName=" + lastName+ ", rollNo=" + rollNo + ", qualification=" + qualification + ", course=" + course + ", year=" + year+ ", certificate=" + certificate + ", hallticketNo=" + hallticketNo + "]";
		}

}
