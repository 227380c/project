package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.StudentDao;
import com.example.model.Student;
import com.example.service.StudentService;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;

	// 获取用户列表
	public List<Student> getStudentList() {

		return studentDao.getStudentList();
	}

	// 根据ID获取用户
	public Student findStudentById(Long id) {

		return studentDao.findStudentById(id);
	}

	// 保存用户
	public void save(Student user) {

		studentDao.save(user);
	}

	// 修改用户
	public void update(Student user) {

		studentDao.update(user);
	}

	// 删除用户
	public void delete(Long id) {

		studentDao.delete(id);
	}

}
