package pro.sky.exam.controller;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.exam.model.Question;
import pro.sky.exam.service.ExaminerService;
import pro.sky.exam.service.QuestionService;

import java.util.Collection;

@Service
@RestController("/exam/get")

public class ExamController {
    private final ExaminerService examinerService;


    public ExamController(ExaminerService examinerService) {
        this.examinerService = examinerService;
    }

    @GetMapping("/{amount}")
    public Collection<Question> getAll(@PathVariable("amount") int amount) {
        return examinerService.getQuestions(amount);
    }
}
