package by.krava.basepatterns.creational.singleton;

import by.krava.basepatterns.creational.factory.Program;

public class ProgramRunner {
    public static void main(String[] args) {
        ProgramLogger.getProjectLogger().addLogInfo("First log...");
        ProgramLogger.getProjectLogger().addLogInfo("Second log...");
        ProgramLogger.getProjectLogger().addLogInfo("Third log...");

        ProgramLogger.getProjectLogger().showLogFile();
    }
}
