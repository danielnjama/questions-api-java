package com.dtechnologies.Quizeapp.controller;


import com.dtechnologies.Quizeapp.Question;
import com.dtechnologies.Quizeapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {


    @Autowired
    QuestionService questionService;

    @GetMapping("allQuestions")
    public ResponseEntity<List<Question>> getAllQuestions(){
        return questionService.getAllQuestions();
    }

    @GetMapping("category/{category}")
    public ResponseEntity<List<Question>> getQuestionByCategory(@PathVariable String category){
        return questionService.getQuestionsByCategory(category);
    }

    @PostMapping("addQuestion")
    public ResponseEntity<String> addQuestion(@RequestBody Question question){
        return questionService.addQuestion(question);
    }

    @GetMapping("difficulty/{difficultlevel}")
    public ResponseEntity<List<Question>> getQuestionByDifficulty(@PathVariable String difficultlevel)
    {
        return questionService.getQuestionsBydifficulty(difficultlevel);
    }
}