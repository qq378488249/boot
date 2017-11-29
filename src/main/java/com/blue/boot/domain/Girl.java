package com.blue.boot.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;

@Entity
public class Girl {

	@Id
	@GeneratedValue
	private Integer id;

	@Min(value = 18, message = "未成年")
	private Integer age;

	private String name;

	public Girl() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Girl{" +
				"id=" + id +
				", age=" + age +
				", name='" + name + '\'' +
				'}';
	}
}