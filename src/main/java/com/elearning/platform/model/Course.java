package com.elearning.platform.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "course")
public class Course {

    @Id
    @Column(name = "courseId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseId;

    @Column(name = "name", nullable = false, unique = true)
    private String courseName;

    @Column(name = "description")
    private String courseDescription;

    @Column(name = "detail")
    private String courseDetail;

    @Column(name = "difficulty")
    private String courseDifficulty;

    @Column(name = "url")
    private String courseUrl;

    private String imgUrl;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tutorId", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Tutor tutor;

    public Long getCourseId() {
		return courseId;
	}


	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public String getCourseDescription() {
		return courseDescription;
	}


	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}


	public String getCourseDetail() {
		return courseDetail;
	}


	public void setCourseDetail(String courseDetail) {
		this.courseDetail = courseDetail;
	}


	public String getCourseDifficulty() {
		return courseDifficulty;
	}


	public void setCourseDifficulty(String courseDifficulty) {
		this.courseDifficulty = courseDifficulty;
	}


	public String getCourseUrl() {
		return courseUrl;
	}


	public void setCourseUrl(String courseUrl) {
		this.courseUrl = courseUrl;
	}


	public String getImgUrl() {
		return imgUrl;
	}


	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}


	public Tutor getTutor() {
		return tutor;
	}


	public void setTutor(Tutor tutor) {
		this.tutor = tutor;
	}


	public Course() {
		// TODO Auto-generated constructor stub
	}
    
    
    public Course(String courseName, String courseDescription, String courseDetail, String courseDifficulty, String courseUrl, String imgUrl, Tutor tutor) {
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.courseDetail = courseDetail;
        this.courseDifficulty = courseDifficulty;
        this.courseUrl = courseUrl;
        this.imgUrl = imgUrl;
        this.tutor = tutor;
    }
}
