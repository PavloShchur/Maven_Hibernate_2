package shchur_pavlo.Hibernate;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;


public class User implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 856354997274633301L;

	private long id;

	private int age;

	private String firstName;
	private String lastName;
	
	
	public User() {
		super();
	}

	public User(long id) {
		super();
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
