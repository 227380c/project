package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.model.Student;
import com.example.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService stuService;

	@RequestMapping("/")
	public String index() {
		return "redirect:/list";
	}

	@RequestMapping(value = "/toHello", method = RequestMethod.GET)
	public String toHello() {
		return "hello";
	}

	@RequestMapping("/list")
	public String getUserlist(Model model) {
		List<Student> userList = stuService.getStudentList();
		System.out.println("Student条数:" + userList.size());
		model.addAttribute("userList", userList);
		return "list";
	}

	@RequestMapping(value = "/toAdd", method = RequestMethod.GET)
	public String toAdd() {
		return "add";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(Student stu) {
		stuService.save(stu);
		return "redirect:/list";
	}

	@RequestMapping(value = "/show", method = RequestMethod.GET)
	public String show(Long id, Model model) {
		Student user = stuService.findStudentById(id);
		model.addAttribute("user", user);
		return "detail";
	}

	@RequestMapping(value = "/toEdit", method = RequestMethod.GET)
	public String toEdit(Long id, Model model) {
		Student user = stuService.findStudentById(id);
		model.addAttribute("user", user);
		return "edit";
	}

	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public String saveEdit(Student user) {
		stuService.update(user);
		return "redirect:/list";
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String del(Long id) {
		stuService.delete(id);
		return "redirect:/list";
	}
}
