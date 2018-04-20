package com.example.dao;

import java.util.List;

import com.example.model.Student;

public interface StudentDao {

	// 获取学生列表
	List<Student> getStudentList();

	// 根据id查询学生
	Student findStudentById(Long id);

	// 保存添加学生
	void save(Student student);

	// 修改更新学生
	void update(Student student);

	// 删除学生
	void delete(Long id);

}
