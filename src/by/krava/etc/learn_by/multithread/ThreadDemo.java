package by.krava.etc.learn_by.multithread;

public class ThreadDemo {
    public static void main(String[] args) {
        WalkThread walk = new WalkThread();
//        walk.run();
        walk.start();

    }
}
