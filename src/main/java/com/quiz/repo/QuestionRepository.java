package com.quiz.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.quiz.model.Question;

@Repository
public interface QuestionRepository extends CrudRepository<Question,Long>{
}
