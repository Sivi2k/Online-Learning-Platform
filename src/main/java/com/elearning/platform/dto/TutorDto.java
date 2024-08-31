package com.elearning.platform.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TutorDto {
    private String name;
    private String surname;
    private String email;
    private String description;
    private String imgUrl;
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public TutorDto() {
		// TODO Auto-generated constructor stub
	}

	public TutorDto(String name, String surname, String email, String description, String imgUrl) {
		super();
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.description = description;
		this.imgUrl = imgUrl;
	}
	
	
    
    
}
