package com.elearning.platform.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tutor")
public class Tutor {

    @Id
    @Column(name = "tutorId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tutorId;
    public Long getTutorId() {
		return tutorId;
	}

	public void setTutorId(Long tutorId) {
		this.tutorId = tutorId;
	}

	public String getTutorName() {
		return tutorName;
	}

	public void setTutorName(String tutorName) {
		this.tutorName = tutorName;
	}

	public String getTutorSurname() {
		return tutorSurname;
	}

	public void setTutorSurname(String tutorSurname) {
		this.tutorSurname = tutorSurname;
	}

	public String getTutorEmail() {
		return tutorEmail;
	}

	public void setTutorEmail(String tutorEmail) {
		this.tutorEmail = tutorEmail;
	}

	public String getTutorDescription() {
		return tutorDescription;
	}

	public void setTutorDescription(String tutorDescription) {
		this.tutorDescription = tutorDescription;
	}

	public String getTutorDetail() {
		return tutorDetail;
	}

	public void setTutorDetail(String tutorDetail) {
		this.tutorDetail = tutorDetail;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	@Column(name = "name")
    private String tutorName;
    @Column(name = "surname")
    private String tutorSurname;
    @Column(name = "email")
    private String tutorEmail;
    @Column(name = "description")
    private String tutorDescription;
    @Column(name = "detail")
    private String tutorDetail;
    private String imgUrl;


    public Tutor(String tutorName, String tutorSurname, String tutorEmail, String tutorDescription, String imgUrl) {
        this.tutorName = tutorName;
        this.tutorSurname = tutorSurname;
        this.tutorEmail = tutorEmail;
        this.tutorDescription = tutorDescription;
        this.imgUrl = imgUrl;
    }

    public Tutor(String tutorDetail) {
        this.tutorDetail = tutorDetail;
    }
    
    public Tutor() {
		// TODO Auto-generated constructor stub
	}
}
