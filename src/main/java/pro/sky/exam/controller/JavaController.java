package pro.sky.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pro.sky.exam.model.Question;
import pro.sky.exam.service.JavaQuestionServiceImpl;
import pro.sky.exam.service.QuestionService;

import java.util.Collection;

@RestController
@RequestMapping("/exam/java")
public class JavaController {

    private final QuestionService questionService;

    @Autowired
    public JavaController(QuestionService questionService) {
        this.questionService = questionService;
    }


    @GetMapping()
    public String hello() {
        return "Добро пожаловать в списки вопросов!";
    }

    @GetMapping(path = "/add")
    public Question addQuestion (@RequestParam("question") String question,
                                 @RequestParam("answer") String answer) {
        return questionService.add(question, answer);
    }

    @GetMapping(path = "/remove")
    public Question removeQuestion (String question, String answer) {
        return questionService.remove(question, answer);
    }

    @GetMapping()
    public Collection<Question> getAll() {
        return questionService.getall();
    }

}
