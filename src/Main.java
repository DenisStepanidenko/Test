import home.Person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person test = new Person(1L , "denis");
        System.out.println(test.getName());
        change(test);
        System.out.println(test.getName());
    }
    public static void change(Person person){
        person.setName("new Den");
    }
}