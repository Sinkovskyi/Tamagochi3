package com.company.exceptions.userExceptionsAsAnswerWithNumber;

/**
 * Created by Artem on 17.11.2016.
 */
public class UserException extends Exception {

    private int number;

    public int getNumber(){
        return number;
    }
    public UserException(String message, int number){
        super(message);
    }
}
