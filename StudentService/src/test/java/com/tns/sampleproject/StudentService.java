package com.tns.sampleproject;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class StudentService {
	
		@Autowired
		private StudentRepository repo;
		
		public void save(StudentEntity employ)
		{
			repo.save(employ);
		}
		
		public List<StudentEntity> getAllStudent()
		{
			return repo.findAll();
		}
		
		public StudentEntity getStudentById(Integer id) 
		{
			return repo.findById(id).orElse(null);
		}
		
		public void deleteStudent(Integer id)
		{
			repo.deleteById(id);
		}

		public void updateStudent(Integer id , StudentEntity updatedStudent)
		{
			StudentEntity existingStudent = repo.findById(id).orElse(null);
			if (existingStudent != null)
			{
				existingStudent.setFirstName(updatedStudent.getFirstName());
				existingStudent.setLastName(updatedStudent.getLastName());
				existingStudent.setRollNo(updatedStudent.getRollNo());
				existingStudent.setQualification(updatedStudent.getQualification());
				existingStudent.setCourse(updatedStudent.getCourse());
				existingStudent.setYear(updatedStudent.getYear());
				existingStudent.setCertificate(updatedStudent.getCertificate());
				existingStudent.setHallTicketNo(updatedStudent.getHallTicketNo());
				repo.save(existingStudent);
			}
		}
}