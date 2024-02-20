package practice2;

import java.time.LocalDate;

public class Human {
    int age;
    String firstName;
    String lastName;
    LocalDate birthDate;
    int weight;
    public Human(int age, String firstName, String lastName, LocalDate birthDate, int weight){
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.weight = weight;
    };

    public String toString(){
        return "age: " + age + "; firstName: " + firstName + "; lastName: " + lastName + "; birthDate: " + birthDate + "; weight: " + weight;
    }
}
