package com.elearning.platform.model;

import com.elearning.platform.auth.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
//@AllArgsConstructor
//@NoArgsConstructor
@Entity
@Table(name = "enrollment")
public class Enrollment {
    @Id
    @Column(name = "enrollmentId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long enrollmentId;

    @Column(name = "date")
    private LocalDate enrollmentDate;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "userId", nullable = false)
    private User userName;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "courseId", nullable = false)
    private Course course;

    public Long getEnrollmentId() {
		return enrollmentId;
	}




	public void setEnrollmentId(Long enrollmentId) {
		this.enrollmentId = enrollmentId;
	}




	public LocalDate getEnrollmentDate() {
		return enrollmentDate;
	}




	public void setEnrollmentDate(LocalDate enrollmentDate) {
		this.enrollmentDate = enrollmentDate;
	}




	public User getUserName() {
		return userName;
	}




	public void setUserName(User userName) {
		this.userName = userName;
	}




	public Course getCourse() {
		return course;
	}




	public void setCourse(Course course) {
		this.course = course;
	}




	public Enrollment() {
		// TODO Auto-generated constructor stub
	}




	public Enrollment(LocalDate enrollmentDate, User userName, Course course) {
        this.enrollmentDate = enrollmentDate;
        this.userName = userName;
        this.course = course;
    }
}
