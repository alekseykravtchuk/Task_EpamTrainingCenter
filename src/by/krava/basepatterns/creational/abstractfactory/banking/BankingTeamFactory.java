package by.krava.basepatterns.creational.abstractfactory.banking;

import by.krava.basepatterns.creational.abstractfactory.Developer;
import by.krava.basepatterns.creational.abstractfactory.ProjectManager;
import by.krava.basepatterns.creational.abstractfactory.ProjectTeamFactory;
import by.krava.basepatterns.creational.abstractfactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
