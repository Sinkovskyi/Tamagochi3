package com.company;

import com.company.exceptions.userExceptionsAsAnswerWithString.UserExceptionNameOfHeroes;
import com.company.logics.Logics;
import com.company.operationsWithTime.TimeDelay;
import com.company.exceptions.userExceptionsAsAnswerWithNumber.UserException;
import com.company.heroes.Dragon;
import com.company.stringConstants.Constants;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws UserException, UserExceptionNameOfHeroes {

        System.out.println(Constants.CHARACTER_SELECRION);
        new TimeDelay();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(Constants.SELECTION_OF_HEROES_NAME);

        String nameOfHeroes = null;

        try {
            nameOfHeroes = br.readLine().trim().replaceAll(" ", "");
        }catch (IOException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }

        Dragon dragon = new Dragon(nameOfHeroes);
        dragon.awaken();

        int a = 0;

        for(int i = 0; i<=6; i++) {
            if(a == 3){
                System.out.println(Constants.ACTIVITY_OF_HEROES_AFTER_BAD_GAME);
                break;
            }

            int randNumber = (int) (1 + Math.random() * 4);

            switch (randNumber){
                case 1: dragon.relax();
                        Logics logics = new Logics();
                        //logics.verification(randNumber);
                        a += logics.verification(randNumber);
                    break;
                case 2:
                        dragon.eat();
                        logics = new Logics();
                        //logics.verification(randNumber);
                        a += logics.verification(randNumber);
                        break;
                case 3:
                        dragon.read();
                        logics = new Logics();
                        //logics.verification(randNumber);
                        a += logics.verification(randNumber);
                        break;
                case 4:
                        dragon.play();
                        logics = new Logics();
                        //logics.verification(randNumber);
                        a += logics.verification(randNumber);
                    break;
            }
        }

        if(a!=3){
            System.out.println(Constants.RESULT_AFTER_GOOD_GAME);
            dragon.goToSleep();
        }
        else{
            System.out.println(Constants.RESULT_AFTER_BAD_GAME);
        }

    }
}
