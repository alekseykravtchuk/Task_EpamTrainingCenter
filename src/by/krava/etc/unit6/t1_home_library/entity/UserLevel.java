package by.krava.etc.unit6.t1_home_library.entity;

public enum UserLevel {
    ADMIN("admin"), USER("user");
    private String name;

    UserLevel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
