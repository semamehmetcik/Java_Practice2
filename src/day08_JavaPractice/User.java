package day08_JavaPractice;

import java.time.LocalDate;

public class User {
    public String name;
    public LocalDate birthdate;

    public User(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }
}