package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CheckBox extends Question {

    private String[] correctOption;

    public CheckBox(String questionStr, String aAnswer, int aPoints) {
        super(questionStr, aPoints);
        super.setAnswer(aAnswer);
        this.setCorrectOption();
    }

    public ArrayList<String> getCorrectOption() {
        return new ArrayList<String>(Arrays.asList(this.correctOption));
    }
    public void setCorrectOption() {
        this.correctOption = super.getAnswer().split(",");
    }

    public void showQuestion() {
        System.out.println(super.getQuestionStr());
        Scanner userInput = new Scanner(System.in);
        int inputCount = super.getAnswer().split(",").length;
        String resultStr = "";
        for (int i = 0; i < inputCount; i++) {
            if (i < inputCount - 1) {
                resultStr +=  userInput.nextLine() + ",";
                System.out.println("next:");
            } else {
                resultStr += userInput.nextLine();
            }

        }

        super.setUserInput(resultStr);
    }

    public void checkQuestion() {
        String[] tempArr = super.getUserInput().split(",");
        int listLength = tempArr.length;
        int counter = 0;
        boolean hasRepeatNum = false;
        int sameNumCount = 0;
        for (String item : tempArr) {
            for (String str : tempArr) {
                if (item.equals(str)) {
                    sameNumCount += 1;
                }
            }
        }
        if (sameNumCount > listLength) {
            hasRepeatNum = true;
        }

        ArrayList<String> answerList =  this.getCorrectOption();
        for (String item : tempArr) {
            if (answerList.contains(item)) {
                counter += 1;
            }
        }
        if (counter == listLength && !hasRepeatNum) {
            super.setIsCorrect(true);
//            System.out.println("Correct");
        }
    }

}
