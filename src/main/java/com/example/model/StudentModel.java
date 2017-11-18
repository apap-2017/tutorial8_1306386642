package com.example.model;

import java.util.List;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentModel
{
	@NotNull
    private String npm;
	@NotNull
    private String name;
	@NotNull
    private double gpa;
	@NotNull
    private List<CourseModel> courses;

}
