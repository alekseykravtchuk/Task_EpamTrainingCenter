package by.krava.basepatterns.creational.abstractfactory.website;

import by.krava.basepatterns.creational.abstractfactory.Developer;
import by.krava.basepatterns.creational.abstractfactory.ProjectManager;
import by.krava.basepatterns.creational.abstractfactory.ProjectTeamFactory;
import by.krava.basepatterns.creational.abstractfactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
