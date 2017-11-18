package com.example.model;

import java.util.List;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseModel {

	@NotNull
	private String idCourse;
	@NotNull
	private String name;
	@NotNull
	private Integer credits;
	@NotNull
	private List<StudentModel> students;

}
