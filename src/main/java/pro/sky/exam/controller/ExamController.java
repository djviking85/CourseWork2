package pro.sky.exam.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.exam.service.QuestionServiceImpl;

@RestController
@RequestMapping("/exam")
public class ExamController {
    @GetMapping()
    public String hello() {
        return "Добро пожаловать в списки вопросов!";
    }
    private QuestionServiceImpl questionService;
    @GetMapping(path = "/java/add")
    public Qustion addQuestion () {
        return QuestionServiceImpl.add;
    }
    public String hello1() {
        return "Добро пожаловать в добавление вопросов!";
    }

    @GetMapping(path = "/java/find")
    public Qustion findQuestion () {
        return QuestionServiceImpl.find;
    }
    public String hello2() {
        return "Добро пожаловать в поиски вопросов!";
    }
    @GetMapping(path = "/java/remove")
    public Qustion removeQuestion () {
        return QuestionServiceImpl.remove;
    }
    public String hello3() {
        return "Добро пожаловать в удаление вопросов!";
    }

}
