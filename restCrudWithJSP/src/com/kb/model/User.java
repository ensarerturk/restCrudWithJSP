/*
 * Bu nesne üzerinde CRUD iþlemlerini gerçekleþtireceðiz .
 * Verileri temsil etmek için kimliði, adý ve yaþý olan bir Kullanýcý sýnýfý oluþturduk.

	@XmlRootElement – xml cinsinden her kullanýcý kaydýnýn kök etiketini belirtir .

	@XmlElement – Kullanýcý kaydýnýn her özniteliði için alt öðeyi belirtir .
 * */

package com.kb.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="User")
public class User {
	private String id;
	private String name;
	private String email;
	private String country;
	
	public String getId() {
		return id;
	}
	
	@XmlElement
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	
	@XmlElement
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	
	@XmlElement
	public void setEmail(String email) {
		this.email = email;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
