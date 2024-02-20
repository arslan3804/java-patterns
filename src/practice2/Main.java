package practice2;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){

        List<Human> input = new ArrayList<>();

        String[] firstNames = new String[] {"Emma", "Charlotte", "Amelia", "James", "William", "Benjamin"};
        String[] lastNames = new String[] {"Smith", "Johnson", "Williams", "Brown", "Jones", "Garcia"};

        for (int i = 0; i < 5; i++){
            int age = (int) Math.floor(Math.random() * 82) + 18;
            String firstName = firstNames[(int) Math.floor(Math.random() * firstNames.length)];
            String lastName = lastNames[(int) Math.floor(Math.random() * lastNames.length)];

            LocalDate birthDate = LocalDate.now().minusYears(age).minusDays((int) Math.floor(Math.random() * 365));
            int weight = (int) Math.floor(Math.random() * 60) + 40 ;

            Human human = new Human(age, firstName, lastName, birthDate, weight);
            input.add(human);

            //System.out.println(human);
        }
        System.out.println("Список людей:");
        input.forEach(System.out::println);

        System.out.println("\nСписок людей с Уменьшением веса каждого объекта на 5:");
        input.stream()
                .map(human -> new Human(human.age, human.firstName, human.lastName, human.birthDate, human.weight - 5))
                .forEach(System.out::println);

        System.out.println("\nСписок людей с  фильтрация по дате рождения меньшей, чем 3 февраля 1999:");

        input.stream()
                .filter(human -> human.birthDate.isBefore(LocalDate.of(1999, 2, 3)))
                .forEach(System.out::println);


        System.out.println("\nКонкатенация фамилий в строку:");
        String concatenatedLastNames = input.stream()
                .map(human -> human.lastName)
                .reduce("", (x, y) -> x + y + " ");
        System.out.println(concatenatedLastNames);
    }
}
