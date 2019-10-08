package by.krava.basepatterns.creational.factory;

public class PhpDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
            return new PhpDeveloper();
    }
}
