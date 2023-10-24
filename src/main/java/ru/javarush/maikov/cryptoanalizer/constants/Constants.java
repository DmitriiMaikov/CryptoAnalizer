package ru.javarush.maikov.cryptoanalizer.constants;

public class Constants {
    private static final String rus = "ЁЙЦУКЕНГШЩЗХЪФЫВАПРОЛДЖЭЯЧСМИТЬБЮ";
    private static final String eng = "QWERTYUIOPASDFGHJKLZXCVBNM";
    private static final String cypher = "1234567890";
    private static final String z = "!@#$%^&*(){}[]|/?,.";
    public static final String ALPHABET = rus + eng + rus.toLowerCase() + eng.toLowerCase() + cypher + z;
}
