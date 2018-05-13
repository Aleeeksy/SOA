package soa.lab8.models;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "UserEntity")
public class UserEntity {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@OneToMany(cascade= CascadeType.ALL, fetch=FetchType.EAGER, mappedBy="userEntity")
	private Set<Rent> rents;
	
	public UserEntity() {}
	
	public UserEntity(String name, Set<Rent> rents) {
		super();
		this.name = name;
		this.rents = rents;
	}
	

	public int getId() {
		return id;
	}

	public void setUser_id(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setUser_name(String name) {
		this.name = name;
	}

	public Set<Rent> getRents() {
		return rents;
	}

	public void setRents(Set<Rent> rents) {
		this.rents = rents;
	}

}
