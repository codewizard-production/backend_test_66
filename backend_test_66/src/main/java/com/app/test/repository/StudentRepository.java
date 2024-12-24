package com.app.test.repository;

import com.app.test.model.Student;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class StudentRepository extends SimpleJpaRepository<Student, String> {
    private final EntityManager em;
    public StudentRepository(EntityManager em) {
        super(Student.class, em);
        this.em = em;
    }
    @Override
    public List<Student> findAll() {
        return em.createNativeQuery("Select * from \"test\".\"Student\"", Student.class).getResultList();
    }
}