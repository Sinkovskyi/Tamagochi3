package com.company.logics;

//import com.company.exceptions.userExceptionsAsAnswerWithNumber.InputUserNumbers;
import com.company.operationsWithTime.TimeDelay;
import com.company.exceptions.userExceptionsAsAnswerWithNumber.UserException;

import java.util.Scanner;


/**
 * Created by Artem on 14.11.2016.
 */
public class Logics {

    public int verification(int randNumber) throws UserException {
        String activity = activityOfHeroes(randNumber);
        int a = 0;
        Scanner scanner = new Scanner(System.in);

        /* __used StringBuilder() because this fragment of code is using in loop and if we use String() we will  always get a new object__*/
        /* __instead of: System.out.print("Введите '" + randNumber + "' чтобы ваш дракончик " + activity + ": ");_____*/

        System.out.print(new StringBuilder().append("Введите '").append(randNumber )
                .append("' чтобы ваш дракончик ").append(activity).append(": ").toString());

        int number = scanner.nextInt();


        /* ______________________ _________________________________You can use this variant___________________________________*/
        //InputUserNumbers.getInputUserNumbers(number);
        /* ___________________________________________________________________________________________________________________*/
        if (number < 1 || number > 4) {
            throw new UserException("Число не может быть меньше 1 и больше 4", number);
        } else if (number == randNumber) {
            StringBuilder correctly = new StringBuilder("Отлично");
            System.out.println(correctly);
            a += 0;
            new TimeDelay();
        } else {
            StringBuilder wrong = new StringBuilder("Вы ввели неправильно");
            System.out.println(wrong);
            a += 1;
            new TimeDelay();
        }
        return a;
    }

    String activityOfHeroes(int randNumber) {
        String activity = null;
        switch (randNumber) {
            case 1:
                activity = "отдохнул";
                break;
            case 2:
                activity = "покушал";
                break;
            case 3:
                activity = "почитал";
                break;
            case 4:
                activity = "поиграл";
                break;
        }
        return activity;

    }
}
