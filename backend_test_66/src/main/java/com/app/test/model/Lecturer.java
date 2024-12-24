package com.app.test.model;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


 
import com.app.test.model.College;
import com.app.test.model.Subject;
import com.app.test.model.Department;
import com.app.test.model.PreviousEducation;
import com.app.test.model.Student;
import com.app.test.model.Course;
import com.app.test.model.Lecturer;
import com.app.test.converter.DurationConverter;
import com.app.test.converter.UUIDToByteConverter;
import com.app.test.converter.UUIDToStringConverter;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.Duration;
import java.util.Date;
import java.sql.Timestamp;
import java.sql.Time;
import java.util.List;
import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Lob;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmMediaStream;

@Entity(name = "Lecturer")
@Table(name = "\"Lecturer\"", schema =  "\"test\"")
@Data
                        
public class Lecturer {
	public Lecturer () {   
  }
	  
  @Id
  @Column(name = "\"StaffID\"", nullable = true )
  private String staffID;
	  
  @Column(name = "\"StaffName\"", nullable = true )
  private String staffName;
  
	  
  @Column(name = "\"PhoneNumber\"", nullable = true )
  private Long phoneNumber;
  
	  
  @Column(name = "\"Address\"", nullable = true )
  private String address;
  
	  
  @Column(name = "\"Specialization\"", nullable = true )
  private String specialization;
  
  
  
  
   
	
@OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
@JoinTable(
            name="\"LecturerTeaches\"",
            joinColumns = @JoinColumn( name="\"StaffID\""),
            inverseJoinColumns = @JoinColumn( name="\"SubjectID\""), schema = "\"test\"")
private List<Subject> teaches = new ArrayList<>();
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "Lecturer [" 
  + "StaffID= " + staffID  + ", " 
  + "StaffName= " + staffName  + ", " 
  + "PhoneNumber= " + phoneNumber  + ", " 
  + "Address= " + address  + ", " 
  + "Specialization= " + specialization 
 + "]";
	}
	
}