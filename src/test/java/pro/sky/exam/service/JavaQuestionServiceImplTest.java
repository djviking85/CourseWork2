package pro.sky.exam.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import pro.sky.exam.model.Question;


import java.util.Collection;
import java.util.Random;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


@ContextConfiguration(classes = {JavaQuestionServiceImpl.class})
@ExtendWith(SpringExtension.class)

class JavaQuestionServiceImplTest {
    @Autowired
    private JavaQuestionServiceImpl javaQuestionService;
// поудалял левый код
//    все равно пишет Failed to load ApplicationContext в ошибки теста, не понимаю почему, помогите.
    @Test
    void testAdd() {
        String question = "question";
        String answer = "answer";
        Question expectedQuestion = new Question(question, answer);
        Question actualQuestion = javaQuestionService.add("question", "answer");
        assertEquals(expectedQuestion, actualQuestion);
    }
    @Test
    void remove_success() {
        String question = "question";
        String answer = "answer";

        Question expectedQuestion = new Question(question, answer);

        Question actualQuestion = javaQuestionService.remove(question, answer);

        assertEquals(expectedQuestion, actualQuestion);
    }

    @Test
    void getAll() {
        Question q1 = new Question("question1", "answer1");
        Question q2 = new Question("question2", "answer2");
        Collection<Question> questions = Set.of(q1, q2);

        Collection<Question> expectedQuestions = questions;

        Collection<Question> actualQuestions = javaQuestionService.getall();

        assertEquals(expectedQuestions, actualQuestions);
    }



}


