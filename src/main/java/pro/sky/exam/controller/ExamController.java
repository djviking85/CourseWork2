package pro.sky.exam.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import pro.sky.exam.exceptions.QuestionException;
import pro.sky.exam.model.Question;
import pro.sky.exam.service.ExaminerService;
import pro.sky.exam.service.QuestionService;

import java.util.Collection;

@Service
@RestController("/exam/get")

public class ExamController {
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler({QuestionException.class})
    public String handleException(RuntimeException e){
        return String.format("%s %s", HttpStatus.BAD_REQUEST.value(), e.getMessage());
    }
    private final ExaminerService examinerService;


    public ExamController(ExaminerService examinerService) {
        this.examinerService = examinerService;
    }

    @GetMapping("/{amount}")
    public Collection<Question> getAll(@PathVariable("amount") int amount) {
        return examinerService.getQuestions(amount);
    }
}
