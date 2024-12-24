package com.app.test.function;

import com.app.test.model.College;
import com.app.test.model.Subject;
import com.app.test.model.Department;
import com.app.test.model.PreviousEducation;
import com.app.test.model.Student;
import com.app.test.model.Course;
import com.app.test.model.Lecturer;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.test.repository.DepartmentRepository;
import com.app.test.repository.CollegeRepository;
import com.app.test.repository.PreviousEducationRepository;
import com.app.test.repository.StudentRepository;
import com.app.test.repository.CourseRepository;
import com.app.test.repository.LecturerRepository;
import com.app.test.repository.SubjectRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
