package com.example.model;

import java.io.Serializable;

public class Student implements Serializable {

	private static final long serialVersionUID = -141893975369584497L;

	private long id;
	private String name;
	private String niceName;
	private int age;

	public Student() {
	}

	public Student(long id, String name, String niceName, int age) {
		super();
		this.id = id;
		this.name = name;
		this.niceName = niceName;
		this.age = age;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNiceName() {
		return niceName;
	}

	public void setNiceName(String niceName) {
		this.niceName = niceName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", niceName=" + niceName + ", age=" + age + "]";
	}
}
