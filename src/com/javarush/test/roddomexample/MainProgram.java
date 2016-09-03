package com.javarush.test.roddomexample;

import com.javarush.test.level02.lesson02.task01.Person;

/**
 * Created by Drudyak on 9/2/16.
 */
public class MainProgram
{

    public static void main(String[] args)
    {
        Person child = new Person(1, 2);
        Person mother = new Person(170, 90);

        Roddom roddom1 = new Roddom();

        child.name = "vasya";
        mother.name = "mamka";

        roddom1.address = "adresa # 1";

        Birthday vasyaBirthday = new Birthday("10.10.1987", child, mother, roddom1);

        System.out.println(vasyaBirthday.date);

    }


}
