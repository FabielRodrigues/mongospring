package com.fabielrodrigues.mongospring.domain;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer Id;
	private String Name;
	private String Email;
	
	public User()
	{
		
	}

	public User(Integer id, String name, String email) {
		super();
		Id = id;
		Name = name;
		Email = email;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		return true;
	}	
}
