package ru.javarush.maikov.cryptoanalizer.commands;

import ru.javarush.maikov.cryptoanalizer.entity.Result;

public interface Action {
    Result execute(String[] parameters);
}
