package pro.sky.exam.service;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import pro.sky.exam.model.Question;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ContextConfiguration(classes = {ExaminerServiceImpl.class})
@ExtendWith(SpringExtension.class)
class ExaminerServiceImplTest {
    @Autowired
    private ExaminerService examinerService;
    @MockBean
    private QuestionService questionService;

    @Test
    void getQuestions_sucess() {
//        prepare
        int amount = 4;
        Question q1 = new Question("Как вас зовут?", " Меня зовут Саша.");
        Question q2 = new Question("Ява это круто?", " Ява это марка мотика.");
        Question q3 = new Question("Максим - это норм имя?", " Моего сына зовут Максим.");
        Question q4 = new Question("Сложно учиться?", " Ахренеть как.");

        Collection<Question> questions = Set.of(q1, q2, q3, q4);
//        excpected

//return all questions
        when(questionService.getall()).thenReturn(questions);
//        return from random question1
//        when(questionService.getRandomQuestion()).thenReturn(q1);

        Collection<Question> expectedQuestion = Set.of(q1);

//        test begin
        Collection<Question> actualQuestion = examinerService.getQuestions(amount);
        assertEquals(expectedQuestion,actualQuestion);
//        verify(questionService).getall();
//        verify(questionService).getRandomQuestion();
//        assertEquals(amount, actualQuestion.size());
    }
}