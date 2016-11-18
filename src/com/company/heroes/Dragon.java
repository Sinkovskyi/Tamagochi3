package com.company.heroes;

import com.company.characters.MainActivityOfCharacters;
import com.company.exceptions.userExceptionsAsAnswerWithString.UserExceptionNameOfHeroes;
import com.company.stringConstants.Constants;

import java.io.IOException;


/**
 * Created by Artem on 13.11.2016.
 *
 */
public class Dragon {

    String nameOfHeroes;
    MainActivityOfCharacters mainActivityOfCharacters;


    public Dragon( String nameOfHeroes) throws  UserExceptionNameOfHeroes {
        super();
        this.nameOfHeroes = nameOfHeroes;
        setMainActivityOfCharacters();
    }




    public void setMainActivityOfCharacters(MainActivityOfCharacters mainActivityOfCharacters){
        this.mainActivityOfCharacters = mainActivityOfCharacters;
    }

    private void setMainActivityOfCharacters() throws UserExceptionNameOfHeroes {
        if(nameOfHeroes.equals("WaterDragon") ){
            System.out.println(Constants.HELP_FOR_WATER_DRAGON);
            setMainActivityOfCharacters(new WaterDragon());
        } else if(nameOfHeroes.equals("FireDragon")){
            System.out.println(Constants.HELP_FOR_FIRE_DRAGON);
            setMainActivityOfCharacters(new FireDragon());

        }else {
            throw new UserExceptionNameOfHeroes("Вы пока что не можете выбирать другие названия героев", nameOfHeroes);
        }
    }

    public void awaken(){mainActivityOfCharacters.awaken();}

    public void relax(){
        mainActivityOfCharacters.relax();
    }

    public void eat(){
        mainActivityOfCharacters.eat();
    }

    public void read(){
        mainActivityOfCharacters.read();
    }

    public void play(){
        mainActivityOfCharacters.play();
    }

    public void goToSleep(){
        mainActivityOfCharacters.goToSleep();
    }



}
