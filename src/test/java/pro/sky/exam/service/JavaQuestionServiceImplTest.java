package pro.sky.exam.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import pro.sky.exam.model.Question;


import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


@ContextConfiguration(classes = {JavaQuestionServiceImpl.class})
@ExtendWith(SpringExtension.class)

class JavaQuestionServiceImplTest {
//    @Autowired
   private JavaQuestionServiceImpl questionService;
    Question mockQuestion = mock(Question.class);
    Question mockQuestion1 = mock(Question.class);
    @Test
    void testAdd() {
        Question question = new Question("Question", "Answer");
        questionService.add("Question", "Answer");
        assertEquals(question, questionService.getall().size());
    }

    //    test add
//    @Test
//    void testAdd() {
////        set
//        Question question = new Question("Question", "Answer");
//
////        Question expectedQuestion = question;
////        ready
//        Question actualQuestion = questionService.add("Question", "Answer");
////        go
//        when(javaQuestionService.add(any())).thenReturn(question);
//        assertEquals(expectedQuestion,actualQuestion);
//
////        when(javaQuestionService.add(any())).thenReturn(question);
////        assertEquals(question, javaQuestionService.add("Question", "Answer"));
//    }
//    @Test
//    void testAdd1() {
//        JavaQuestionServiceImpl javaQuestionService = new JavaQuestionServiceImpl("Question", "Answer");
//        javaQuestionService.add("Question", "Answer");
//        assertEquals(1, javaQuestionService.getall().size());
//    }
}


