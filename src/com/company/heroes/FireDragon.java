package com.company.heroes;


import com.company.characters.MainActivityOfCharacters;

/**
 * Created by Artem on 13.11.2016.
 */


public class FireDragon implements MainActivityOfCharacters{

    @Override
    public void awaken() {
        StringBuilder activity  = new StringBuilder ("ваш огненный дракончик проснулся");
        System.out.println(activity);
    }

    @Override
    public void relax() {
        StringBuilder activity  = new StringBuilder ("ваш огненный дракончик хочет отдохнуть");
        System.out.println(activity);
    }

    @Override
    public void eat() {
        StringBuilder activity  = new StringBuilder ("ваш огненный дракончик хочет покушать");
        System.out.println(activity);
    }

    @Override
    public void read() {
        StringBuilder activity  = new StringBuilder ("ваш огненный дракончик хочет почитать книгу");
        System.out.println(activity);
    }

    @Override
    public void play() {
        StringBuilder activity  = new StringBuilder ("ваш огненный дракончик хочет поиграть");
        System.out.println(activity);
    }

    @Override
    public void goToSleep() {
        StringBuilder activity  = new StringBuilder ("ваш огненный дракончик идёт спать");
        System.out.println(activity);
    }
}