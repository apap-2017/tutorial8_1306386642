	package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.StudentMapper;
import com.example.model.CourseModel;
import com.example.model.StudentModel;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class StudentServiceDatabase implements StudentService
{
    @Autowired
    private StudentMapper studentMapper;


    @Override
    public StudentModel selectStudent (String npm)
    {
        log.info ("select student with npm {}", npm);
        return studentMapper.selectStudent (npm);
    }


    @Override
    public List<StudentModel> selectAllStudents ()
    {
        log.info ("select all students");
        return studentMapper.selectAllStudents ();
    }


    @Override
    public void addStudent (StudentModel student)
    {
        studentMapper.addStudent (student);
    }


    @Override
    public void deleteStudent (String npm)
    {
    		log.info("Student " + npm + " delete");
    		studentMapper.deleteStudent(npm);
    }


	@Override
	public void updateStudent(StudentModel student) {
		// TODO Auto-generated method stub
		log.info("Student berhasil diperbaharui");
		
		studentMapper.updateStudent(student);
		
	}

	@Override
	public CourseModel selectCourse(String id_course) {
		// TODO Auto-generated method stub
		log.info("Course berhasil");
		return studentMapper.selectCourse(id_course);
	}
	
	@Override
	public List<CourseModel> selectAllCourse() {
		// TODO Auto-generated method stub
		return studentMapper.selectAllCourse();
	}

}
