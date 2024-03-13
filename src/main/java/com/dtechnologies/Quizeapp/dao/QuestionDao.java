package com.dtechnologies.Quizeapp.dao;

import com.dtechnologies.Quizeapp.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {
    List<Question> findQuestionByCategory(String category);

    List<Question> findQuestionByDifficultlevel(String difficultlevel);
}
