package by.krava.etc.unit5.t1_text_file;

/*
 * Создать объект класса Текстовый файл, используя классы Файл, Директория.
 * Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
 */

public class Main {
    public static void main(String[] args) {
        Directory directory = new Directory("Learn Java");
        String fileName = "Spring in Action";
        TextFile tFile = new TextFile(directory, fileName);
        String line1 = "Craig Walls is a software developer at Pivotal and is the author of Spring in Action.";
        tFile.addText(line1);

        System.out.println("Text file created: \"" + tFile.getFileName() + "\"");

        tFile.changeName("Spring Boot in Action");
        System.out.println("The file name is changed to \"" + tFile.getFileName() + "\"");

        System.out.println("\nTest: print content.");
        tFile.printContent();

        System.out.println("\nTest: add content and print.");
        String line2 = "He's a zealous promoter of the Spring Framework, speaking frequently at local user groups and conferences.";
        tFile.addText(line2);
        tFile.printContent();

        System.out.println("\nTest: print the contents of a directory.");
        for (File file : directory.getFiles()) {
            System.out.println(file);
        }

        System.out.println("\nTest: create a new text file and print the contents of the directory.");
        File tFile2 = new TextFile(directory, "Java For Dummies");
        for (TextFile file : directory.getFiles()) {
            System.out.println(file);
        }

        System.out.println("\nTest: deleting a text file and print the contents of the directory.");
        directory.removeFile("Spring Boot in Action");
        for (TextFile file : directory.getFiles()) {
            System.out.println(file);
        }
    }
}
