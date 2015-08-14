package com.spring.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



@Entity
public class Company {	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="company")
	private String nameCompany;
	

	@Column(name="phone")
	private String phone;
	

	@Column(name="email")
	private String email;
	

	@OneToMany ( cascade=CascadeType.ALL, fetch=FetchType.EAGER, mappedBy = "company")
	private List<Cartridge> listCartridges;
	
	// BEGIN //CONSTRUCTOR

	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Company(String nameCompany, String phone, String email) {
		super();
		this.nameCompany = nameCompany;
		this.phone = phone;
		this.email = email;
	}



	// END //CONSTRUCTOR

	// BEGIN // GETTER & SETTER
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameCompany() {
		return nameCompany;
	}

	public void setNameCompany(String nameCompany) {
		this.nameCompany = nameCompany;
	}

	public List<Cartridge> getListCartridges() {
		return listCartridges;
	}

	public void setListCartridges(List<Cartridge> listCartridges) {
		this.listCartridges = listCartridges;
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	// END // GETTER & SETTER



	@Override
	public String toString() {
		return "Company [id=" + id + ", nameCompany=" + nameCompany + ", phone=" + phone + ", email=" + email + ", listCartridges=" + listCartridges + "]";
	}






	

	

	
	
	
	
	
	
	

}
