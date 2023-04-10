package pro.sky.exam.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import pro.sky.exam.model.Question;

import java.util.*;

@Service


public class JavaQuestionServiceImpl implements QuestionService {



    private final Random random;

    public JavaQuestionServiceImpl(Random random) {
        this.random = random;
 }
// оставил для статика - спецом не удаляю
//    public static List<Question> questions = new ArrayList<>();
//static {
//    Question q1 = new Question("Как вас зовут?", " Меня зовут Саша.");
//    Question q2 = new Question("Ява это круто?", " Ява это марка мотика.");
//    Question q3 = new Question("Максим - это норм имя?", " Моего сына зовут Максим.");
//    Question q4 = new Question("Сложно учиться?", " Ахренеть как.");
//
//    questions.add(q1);
//    questions.add(q2);
//    questions.add(q3);
//    questions.add(q4);
//
//}
    private Set<Question> questions = new HashSet<>();


    @Override
    public Question add(String question, String answer) {
        Question newQuestion = new Question(question, answer);
        questions.add(newQuestion);

        return newQuestion;
    }

    @Override
    public Question add(Question question) {
        questions.add(question);
        return question;
    }

    @Override
    public Question remove(String question, String answer) {
        Question forDelete = new Question(question, answer);
        questions.remove(forDelete);
        return forDelete;
    }

    @Override
    public Collection<Question> getall() {
        return questions;
    }

    @Override
    public Question getRandomQuestion() {
        Random rn = new Random();
        List<Question> questionList = new ArrayList<>(questions);

        return questionList.get(rn.nextInt(questionList.size()));
    }
}

