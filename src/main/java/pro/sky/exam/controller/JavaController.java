package pro.sky.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pro.sky.exam.model.Question;
import pro.sky.exam.service.JavaQuestionServiceImpl;
import pro.sky.exam.service.QuestionService;

@RestController
@RequestMapping("/exam")
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

    @GetMapping(path = "/java/add")
    public Question addQuestion (@RequestParam("question") String question,
                                 @RequestParam("answer") String answer) {
        return questionService.add(question, answer);
    }
//    public String hello1() {
//        return "Добро пожаловать в добавление вопросов!";
//    }

//    @GetMapping(path = "/java/find")
//    public Question findQuestion () {
//        return questionService.find;
//    }
    public String hello2() {
        return "Добро пожаловать в поиски вопросов!";
    }
    @GetMapping(path = "/java/remove")
    public Question removeQuestion (String question, String answer) {
        return questionService.remove(question, answer);
    }
//    public String hello3() {
//        return "Добро пожаловать в удаление вопросов!";
//    }
//    @PathVariable - почитать для эмоунт

}
