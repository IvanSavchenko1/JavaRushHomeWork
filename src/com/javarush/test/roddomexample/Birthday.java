package com.javarush.test.roddomexample;

import com.javarush.test.level02.lesson02.task01.Person;

/**
 * Created by Drudyak on 9/2/16.
 */
public class Birthday
{

    public String date;
    private String privet;


    public void printDetails(Person p1, Person p2, Roddom p3)
    {

        System.out.println(p1.name);
        System.out.println(p2.name);
        System.out.println(p3.address);


    }

    public Birthday(String localDate, Person child, Person mother, Roddom roddom)
    {

        date = localDate;

        printDetails(child, mother, roddom);


    }


}
