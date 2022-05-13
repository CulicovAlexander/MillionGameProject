package main;
import answerQuestion.Answer;
import answerQuestion.AnswerSequence;
import answerQuestion.Question;
import java.util.Random;

import java.util.*;

public class QuestionInit {

    Random rand = new Random();
    int range = rand.nextInt(3);

    public Question getQuestionByLevel(int lvl) {
        switch (lvl){

            case 1 :
                return questionsList_lvl_1.get(range);

            case 2 :
                return questionsList_lvl_2.get(range);

            case 3 :
                return questionsList_lvl_3.get(range);

            case 4:
                return questionsList_lvl_4.get(range);

            case 5:
                return questionsList_lvl_5.get(range);


        }
        System.out.println("Error");
        return question_1_lvl_1;
    }



    Answer answerOne = new Answer("Test1 True Answer1", true, AnswerSequence.A);
    Answer answerTwo = new Answer("Test1 Answer2", false, AnswerSequence.B);
    Answer answerThree = new Answer("Test1 Answer3", false, AnswerSequence.C);
    Answer answerFour = new Answer("Test1 Answer4", false, AnswerSequence.D);

    Answer[] answersListTest = new Answer[] {answerOne, answerTwo, answerThree, answerFour};

    List<Answer> answerList_question_1_lvl_1 = Arrays.asList(answersListTest);

    String question1 = "What is the capital of Great Britain?";
    Question question_1_lvl_1 = new Question(question1, 1, 100, answerList_question_1_lvl_1);


    Answer answerFive = new Answer("Test2 Answer1", false, AnswerSequence.A);
    Answer answerSix = new Answer("Test2 True Answer2", true, AnswerSequence.B);
    Answer answerSeven = new Answer("Test2 Answer3", false, AnswerSequence.C);
    Answer answerEight = new Answer("Test2 Answer4", false, AnswerSequence.D);

    Answer[] answersListTest2 = new Answer[] {answerFive, answerSix, answerSeven, answerEight};

    List<Answer> answerList_question_2_lvl_1 = Arrays.asList(answersListTest2);

    String question2 = "Test2?";
    Question question_2_lvl_1 = new Question(question2, 1, 100, answerList_question_2_lvl_1);


    Answer answerNine = new Answer("Test3 Answer1", false, AnswerSequence.A);
    Answer answerTen = new Answer("Test3 Answer2", false, AnswerSequence.B);
    Answer answerEleven = new Answer("Test3 True Answer3", true, AnswerSequence.C);
    Answer answerTwelve = new Answer("Test3 Answer4", false, AnswerSequence.D);

    Answer[] answersListTest3 = new Answer[] {answerNine, answerTen, answerEleven, answerTwelve};

    List<Answer> answerList_question_3_lvl_1 = Arrays.asList(answersListTest3);

    String question3 = "Test3?";
    Question question_3_lvl_1 = new Question(question3, 1, 100, answerList_question_3_lvl_1);

    Question[] questionsList_lvl_1Test = new Question[] {question_1_lvl_1, question_2_lvl_1, question_3_lvl_1};

    List<Question> questionsList_lvl_1 = Arrays.asList(questionsList_lvl_1Test);


    // SECOND LVL


    Answer answer13 = new Answer("Test4 True Answer1", true, AnswerSequence.A);
    Answer answer14 = new Answer("Test4 Answer2", false, AnswerSequence.B);
    Answer answer15 = new Answer("Test4 Answer3", false, AnswerSequence.C);
    Answer answer16 = new Answer("Test4 Answer4", false, AnswerSequence.D);

    Answer[] answersListTest4 = new Answer[] {answer13, answer14, answer15, answer16};

    List<Answer> answerList_question_1_lvl_2 = Arrays.asList(answersListTest4);

    String question4 = "Test4?";
    Question question_1_lvl_2 = new Question(question4, 2, 500, answerList_question_1_lvl_2);

    Answer answer17 = new Answer("Test5 Answer1", false, AnswerSequence.A);
    Answer answer18 = new Answer("Test5 True Answer2", true, AnswerSequence.B);
    Answer answer19 = new Answer("Test5 Answer3", false, AnswerSequence.C);
    Answer answer20 = new Answer("Test5 Answer4", false, AnswerSequence.D);

    Answer[] answersListTest5 = new Answer[] {answer17, answer18, answer19, answer20};

    List<Answer> answerList_question_2_lvl_2 = Arrays.asList(answersListTest5);

    String question5 = "Test5?";
    Question question_2_lvl_2 = new Question(question5, 2, 500, answerList_question_2_lvl_2);

    Answer answer21 = new Answer("Test6 Answer1", false, AnswerSequence.A);
    Answer answer22 = new Answer("Test6 Answer2", false, AnswerSequence.B);
    Answer answer23 = new Answer("Test6 True Answer3", true, AnswerSequence.C);
    Answer answer24 = new Answer("Test6 Answer4", false, AnswerSequence.D);

    Answer[] answersListTest6 = new Answer[] {answer21, answer22, answer23, answer24};

    List<Answer> answerList_question_3_lvl_2 = Arrays.asList(answersListTest6);

    String question6 = "Test6?";
    Question question_3_lvl_2 = new Question(question6, 2, 500, answerList_question_3_lvl_2);


    Question[] questionsList_lvl_2Test = new Question[] {question_1_lvl_2, question_2_lvl_2, question_3_lvl_2};

    List<Question> questionsList_lvl_2 = Arrays.asList(questionsList_lvl_2Test);

    // THIRD LVL

    Answer answer25 = new Answer("Test7 True Answer1", true, AnswerSequence.A);
    Answer answer26 = new Answer("Test7 Answer2", false, AnswerSequence.B);
    Answer answer27 = new Answer("Test7 Answer3", false, AnswerSequence.C);
    Answer answer28 = new Answer("Test7 Answer4", false, AnswerSequence.D);

    Answer[] answersListTest7 = new Answer[] {answer25, answer26, answer27, answer28};

    List<Answer> answerList_question_1_lvl_3 = Arrays.asList(answersListTest7);

    String question7 = "Test7?";
    Question question_1_lvl_3 = new Question(question7, 3, 1500, answerList_question_1_lvl_3);

    Answer answer29 = new Answer("Test8 Answer1", false, AnswerSequence.A);
    Answer answer30 = new Answer("Test8 True Answer2", true, AnswerSequence.B);
    Answer answer31 = new Answer("Test8 Answer3", false, AnswerSequence.C);
    Answer answer32 = new Answer("Test8 Answer4", false, AnswerSequence.D);

    Answer[] answersListTest8 = new Answer[] {answer29, answer30, answer31, answer32};

    List<Answer> answerList_question_2_lvl_3 = Arrays.asList(answersListTest8);

    String question8 = "Test8?";
    Question question_2_lvl_3 = new Question(question8, 3, 1500, answerList_question_2_lvl_3);

    Answer answer33 = new Answer("Test9 Answer1", false, AnswerSequence.A);
    Answer answer34 = new Answer("Test9 Answer2", false, AnswerSequence.B);
    Answer answer35 = new Answer("Test9 True Answer3", true, AnswerSequence.C);
    Answer answer36 = new Answer("Test9 Answer4", false, AnswerSequence.D);

    Answer[] answersListTest9 = new Answer[] {answer33, answer34, answer35, answer36};

    List<Answer> answerList_question_3_lvl_3 = Arrays.asList(answersListTest9);

    String question9 = "Test9?";
    Question question_3_lvl_3 = new Question(question9, 3, 1500, answerList_question_3_lvl_3);


    Question[] questionsList_lvl_3Test = new Question[] {question_1_lvl_3, question_2_lvl_3, question_3_lvl_3};

    List<Question> questionsList_lvl_3 = Arrays.asList(questionsList_lvl_3Test);

    // FORTH LVL


    Answer answer37 = new Answer("Test10 True Answer1", true, AnswerSequence.A);
    Answer answer38 = new Answer("Test10 Answer2", false, AnswerSequence.B);
    Answer answer39 = new Answer("Test10 Answer3", false, AnswerSequence.C);
    Answer answer40 = new Answer("Test10 Answer4", false, AnswerSequence.D);

    Answer[] answersListTest10 = new Answer[] {answer37, answer38, answer39, answer40};

    List<Answer> answerList_question_1_lvl_4 = Arrays.asList(answersListTest10);

    String question10 = "Test10?";
    Question question_1_lvl_4 = new Question(question10, 4, 5000, answerList_question_1_lvl_4);

    Answer answer41 = new Answer("Test11 Answer1", false, AnswerSequence.A);
    Answer answer42 = new Answer("Test11 True Answer2", true, AnswerSequence.B);
    Answer answer43 = new Answer("Test11 Answer3", false, AnswerSequence.C);
    Answer answer44 = new Answer("Test11 Answer4", false, AnswerSequence.D);

    Answer[] answersListTest11 = new Answer[] {answer41, answer42, answer43, answer44};

    List<Answer> answerList_question_2_lvl_4 = Arrays.asList(answersListTest11);

    String question11 = "Test11?";
    Question question_2_lvl_4 = new Question(question11, 4, 5000, answerList_question_2_lvl_4);

    Answer answer45 = new Answer("Test12 Answer1", false, AnswerSequence.A);
    Answer answer46 = new Answer("Test12 Answer2", false, AnswerSequence.B);
    Answer answer47 = new Answer("Test12 True Answer3", true, AnswerSequence.C);
    Answer answer48 = new Answer("Test12 Answer4", false, AnswerSequence.D);

    Answer[] answersListTest12 = new Answer[] {answer45, answer46, answer47, answer48};

    List<Answer> answerList_question_3_lvl_4 = Arrays.asList(answersListTest12);

    String question12 = "Test12?";
    Question question_3_lvl_4 = new Question(question12, 4, 5000, answerList_question_3_lvl_4);


    Question[] questionsList_lvl_4Test = new Question[] {question_1_lvl_4, question_2_lvl_4, question_3_lvl_4};

    List<Question> questionsList_lvl_4 = Arrays.asList(questionsList_lvl_4Test);


    //FIFTH lvl

    Answer answer49 = new Answer("Test13 True Answer1", true, AnswerSequence.A);
    Answer answer50 = new Answer("Test13 Answer2", false, AnswerSequence.B);
    Answer answer51 = new Answer("Test13 Answer3", false, AnswerSequence.C);
    Answer answer52 = new Answer("Test13 Answer4", false, AnswerSequence.D);

    Answer[] answersListTest13 = new Answer[] {answer49, answer50, answer51, answer52};

    List<Answer> answerList_question_1_lvl_5 = Arrays.asList(answersListTest13);

    String question13 = "Test13?";
    Question question_1_lvl_5 = new Question(question13, 5, 10000, answerList_question_1_lvl_5);

    Answer answer53 = new Answer("Test14 Answer1", false, AnswerSequence.A);
    Answer answer54 = new Answer("Test14 True Answer2", true, AnswerSequence.B);
    Answer answer55 = new Answer("Test14 Answer3", false, AnswerSequence.C);
    Answer answer56 = new Answer("Test14 Answer4", false, AnswerSequence.D);

    Answer[] answersListTest14 = new Answer[] {answer53, answer54, answer55, answer56};

    List<Answer> answerList_question_2_lvl_5 = Arrays.asList(answersListTest14);

    String question14 = "Test14?";
    Question question_2_lvl_5 = new Question(question14, 5, 10000, answerList_question_2_lvl_5);

    Answer answer57 = new Answer("Test15 Answer1", false, AnswerSequence.A);
    Answer answer58 = new Answer("Test15 Answer2", false, AnswerSequence.B);
    Answer answer59 = new Answer("Test15 True Answer3", true, AnswerSequence.C);
    Answer answer60 = new Answer("Test15 Answer4", false, AnswerSequence.D);

    Answer[] answersListTest15 = new Answer[] {answer57, answer58, answer59, answer60};

    List<Answer> answerList_question_3_lvl_5 = Arrays.asList(answersListTest15);

    String question15 = "Test15?";
    Question question_3_lvl_5 = new Question(question15, 5, 10000, answerList_question_3_lvl_5);


    Question[] questionsList_lvl_5Test = new Question[] {question_1_lvl_5, question_2_lvl_5, question_3_lvl_5};

    List<Question> questionsList_lvl_5 = Arrays.asList(questionsList_lvl_5Test);

}
