package com.app.test.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.app.test.model.College;
import com.app.test.model.Subject;
import com.app.test.model.Department;
import com.app.test.model.PreviousEducation;
import com.app.test.model.Student;
import com.app.test.model.Course;
import com.app.test.model.Lecturer;

@Entity(name = "CollegeCollegeStaff")
@Table(schema = "\"test\"", name = "\"CollegeCollegeStaff\"")
@Data
public class CollegeCollegeStaff{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"CollegeID\"")
	private Integer collegeID;

    
    @Column(name = "\"DeptID\"")
    private String deptID;
 
}