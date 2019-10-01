package by.krava.etc.learn_by.exception;

public class ConstructorMain {
    public static void main(String [] args) throws ResourceException{
        try {
            ConcreteResource resource = new ConcreteResource();
            ResourceAction.load(resource);
        } catch (ResourceException e) {
            e.printStackTrace();
        }
        SameResource sameResource = new SameResource();
    }
}
