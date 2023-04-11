package pro.sky.exam.service;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import pro.sky.exam.exceptions.QuestionException;
import pro.sky.exam.model.Question;

import java.util.ArrayList;
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
    void testGetQuestions() {
        when(questionService.getall()).thenReturn(new ArrayList<>());

        assertThrows(QuestionException.class, () -> examinerService.getQuestions(10));
        verify(questionService).getall();

    }


    }
