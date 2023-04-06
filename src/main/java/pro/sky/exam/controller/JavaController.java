package pro.sky.exam.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.exam.model.Question;
import pro.sky.exam.service.JavaQuestionServiceImpl;

@RestController
@RequestMapping("/exam")
public class JavaController {
    @GetMapping()
    public String hello() {
        return "Добро пожаловать в списки вопросов!";
    }
    private JavaQuestionServiceImpl questionService;
    @GetMapping(path = "/java/add")
    public Question addQuestion () {
        return JavaQuestionServiceImpl.add;
    }
    public String hello1() {
        return "Добро пожаловать в добавление вопросов!";
    }

    @GetMapping(path = "/java/find")
    public Question findQuestion () {
        return JavaQuestionServiceImpl.find;
    }
    public String hello2() {
        return "Добро пожаловать в поиски вопросов!";
    }
    @GetMapping(path = "/java/remove")
    public Question removeQuestion () {
        return JavaQuestionServiceImpl.remove;
    }
    public String hello3() {
        return "Добро пожаловать в удаление вопросов!";
    }

}
