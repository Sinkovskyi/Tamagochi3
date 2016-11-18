package com.company.exceptions.userExceptionsAsAnswerWithString;

/**
 * Created by Artem on 18.11.2016.
 */
public class UserExceptionNameOfHeroes extends Exception{
    private String  nameOfHeroes;

   public UserExceptionNameOfHeroes(String  message, String  nameOfHeroes){
       super(message);
   }


    public String  getNameOfHeroes(){
        return nameOfHeroes;
    }

}
