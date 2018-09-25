package model;

import java.util.Date;
import java.util.List;

public class Student {
	private String name;
	private int age;
	private List favorites;
	private String grade;
	private Date birthday;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List getFavorites() {
		return favorites;
	}
	public void setFavorites(List favorites) {
		this.favorites = favorites;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
}
