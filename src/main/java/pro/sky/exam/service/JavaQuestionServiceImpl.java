package pro.sky.exam.service;

import org.springframework.stereotype.Service;
import pro.sky.exam.model.Question;

@Service

//public class JavaQuestionServiceImpl implements QuestionService
public class JavaQuestionServiceImpl
{
    // делаем адд
//    @Override
    public String add(String question, String answer) {
        Question question1 = new Question(question, answer);

        return String.valueOf(question1);
    }
}
