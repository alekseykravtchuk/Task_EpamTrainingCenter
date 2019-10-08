package by.krava.basepatterns.creational.abstractfactory.banking;

import by.krava.basepatterns.creational.abstractfactory.Developer;

public class JavaDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Java developer writes java code...");
    }
}
