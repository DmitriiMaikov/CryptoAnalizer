package ru.javarush.maikov.cryptoanalizer;

import ru.javarush.maikov.cryptoanalizer.entity.Result;


/**
 * Hello world!
 */
public class ConsoleRunner {
    public static void main(String[] args) {
        Application application = new Application();
        Result result = application.run(args);

        System.out.println(result);

    }
}
//        int key = 123; //<<<<< args
//        String text = "Привет Мишутка"; //<<<<< args
//        String result = "........"; //<<<<< args