package pro.sky.exam.service;

import org.springframework.stereotype.Service;
import pro.sky.exam.model.Question;

import java.util.*;

@Service

public class JavaQuestionServiceImpl implements QuestionService {
    private Set<Question> questions = new HashSet<>();

//    public JavaQuestionServiceImpl(Random random) {
//        this.random = random;
//    }
//
//    private final Random random;
//    private final Random random;
//
//    public JavaQuestionServiceImpl(Random random) {
//        this.random = random;
//    }
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
//// делаем мапу - те. по уникальному номеру вопроса - будем делать вопрос - ответ
//    private final Map<Integer, Question> questionByHashCode = new HashMap<>();
//// делоем метод на  значение вопроса
//    // ОСТАНОВИЛСЯ ТУТ
//    private int getQuestionKey(String question, String answer) {
//        return Objects.hash(question, answer);
//    // делаем адд
////    @Override
//    public String add(String question, String answer) {
//        Question question1 = new Question(question, answer);
//
//        return String.valueOf(question1);
//    }
//
//
////    @Override
//
//    public Question find(String firstName, String lastName) {
////        int questionByHashCode = getEmployeeKey(firstName, lastName);
////        checksNameAndSurname(firstName, lastName);
//
//        Question question = questionByHashCode.get(Integer number);
//
////        if (employee == null) {
////            throw new EmployeeNotFoundException(" при поиске сотрудник не найден.");
////        }
//        return questions;
//    }
//}

    @Override
    public Question add(String question, String answer) {
        Question newQuestion = new Question(question, answer);

        return add(newQuestion);
    }

    @Override
    public Question add(Question question) {
        questions.add(question);
        return question;
    }
// correct rem
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

