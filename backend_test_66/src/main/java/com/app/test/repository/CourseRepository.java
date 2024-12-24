package com.app.test.repository;

import com.app.test.model.Course;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class CourseRepository extends SimpleJpaRepository<Course, String> {
    private final EntityManager em;
    public CourseRepository(EntityManager em) {
        super(Course.class, em);
        this.em = em;
    }
    @Override
    public List<Course> findAll() {
        return em.createNativeQuery("Select * from \"test\".\"Course\"", Course.class).getResultList();
    }
}