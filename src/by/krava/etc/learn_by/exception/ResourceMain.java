package by.krava.etc.learn_by.exception;

public class ResourceMain {
    public static void main(String ... args) {
        try {
            Resource resource = new Resource();
            ResourceAction.load(resource);
        } catch (ResourceException e) {
            e.printStackTrace();
        }
    }
}
