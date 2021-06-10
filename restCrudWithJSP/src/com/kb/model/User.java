/*
 * Bu nesne �zerinde CRUD i�lemlerini ger�ekle�tirece�iz .
 * Verileri temsil etmek i�in kimli�i, ad� ve ya�� olan bir Kullan�c� s�n�f� olu�turduk.

	@XmlRootElement � xml cinsinden her kullan�c� kayd�n�n k�k etiketini belirtir .

	@XmlElement � Kullan�c� kayd�n�n her �zniteli�i i�in alt ��eyi belirtir .
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
