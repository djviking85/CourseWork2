package pro.sky.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pro.sky.exam.service.JavaQuestionServiceImpl;

@RestController
@RequestMapping("/exam")
public class JavaController {

    private final JavaQuestionServiceImpl javaQuestionService;

    @Autowired
    public JavaController(JavaQuestionServiceImpl javaQuestionService) {
        this.javaQuestionService = javaQuestionService;
    }


    @GetMapping()
    public String hello() {
        return "Добро пожаловать в списки вопросов!";
    }
    private JavaQuestionServiceImpl questionService;
    @GetMapping(path = "/java/add")
    public String addQuestion (@RequestParam("question") String question,
                               @RequestParam("answer") String answer) {
        return javaQuestionService.add(question, answer);
    }
//    public String hello1() {
//        return "Добро пожаловать в добавление вопросов!";
//    }

//    @GetMapping(path = "/java/find")
//    public Question findQuestion () {
//        return JavaQuestionServiceImpl.find;
//    }
//    public String hello2() {
//        return "Добро пожаловать в поиски вопросов!";
//    }
//    @GetMapping(path = "/java/remove")
//    public Question removeQuestion () {
//        return JavaQuestionServiceImpl.remove;
//    }
//    public String hello3() {
//        return "Добро пожаловать в удаление вопросов!";
//    }
//    @PathVariable - почитать для эмоунт

}
