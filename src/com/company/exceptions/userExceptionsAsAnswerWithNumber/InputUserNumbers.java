package com.company.exceptions.userExceptionsAsAnswerWithNumber;

/**
 * Created by Artem on 17.11.2016.
 */
public class InputUserNumbers {
    public static int getInputUserNumbers(int number) throws UserException {
        int result = 1;
        if (number < 1 || number > 4) {
            throw new UserException("Число не может быть меньше 1 и больше 4", number);
        }else{
            return result;
        }
    }

}
