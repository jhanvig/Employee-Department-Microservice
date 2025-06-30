package com.dailycodebuffer.employee_service.model;

public class Employee{
	private final Long id;
	private final String name;
	private final Long departmentId;
	private final int age;
	private final String position;
	
	public Long getDepartmentId() {
		return departmentId;
	}

	public int getAge() {
		return age;
	}

	public String getPosition() {
		return position;
	}
	
	public Employee(Long id,String name, String position, Long departmentId, int age)
	{
		this.id=id;
		this.name=name;
		this.departmentId = departmentId;
		this.age = age;
		this.position = position;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", departmentId=" + departmentId + ", age=" + age
				+ ", position=" + position + "]";
	}

	public Long id() {
		return id;
	}
	
	public String name() {
		return name;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
