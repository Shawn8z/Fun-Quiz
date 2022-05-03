package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        MultiChoice q1 = new MultiChoice("which as a number,  [a, b, 3, d], enter the index.", "2",4);
        CheckBox q2 = new CheckBox("Pick out all the numbers, [1, 2, b, 4].", "1,2,4", 4);
        CheckBox q3 = new CheckBox("Pick out all the numbers, [1, 2, 3, b, 4, 5].", "1,2,3,4,5", 4);
        TrueOrFalse q4 = new TrueOrFalse("Arrays and ArrayList are the same?", "false", 4);
//

        ArrayList<Question> QList = new ArrayList<>();
        QList.add(q1);
        QList.add(q2);
        QList.add(q3);
        QList.add(q4);

        Quiz unitOne = new Quiz(QList);
        unitOne.runQuiz();
        unitOne.GradeQuiz();
    }
}
