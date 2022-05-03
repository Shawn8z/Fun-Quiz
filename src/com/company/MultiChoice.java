package com.company;

import java.util.Scanner;

public class MultiChoice extends Question{

    public MultiChoice(String questionStr, String aAnswer, int aPoints) {
        super(questionStr, aPoints);
        super.setAnswer(aAnswer);
    }


    public void showQuestion() {
        System.out.println(super.getQuestionStr());
        Scanner userInput = new Scanner(System.in);
        String inputStr = userInput.nextLine();
        super.setUserInput(inputStr);
    }


    public void checkQuestion() {
        if (super.getUserInput().equals((super.getAnswer()))) {
            super.setIsCorrect(true);
//            System.out.println("Correct");
        }
    }
}
