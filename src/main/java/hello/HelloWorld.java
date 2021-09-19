package hello;

import java.util.List;
import hello.ContretePerson;

public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("HelloWorld");

        ContretePerson kees = new ContretePerson("Kees Kaas", 43);
        ContretePerson jan = new VeryImportantPerson("Jan Smit", 48);

        List<AbstractPerson> people = List.of(kees, jan);
        List<StoryTeller> tellers = List.of(kees, jan);

        for (AbstractPerson person: people) {
            System.out.println(String.format("Ik ben %s", person.getName()));
        }

        for (StoryTeller teller: tellers) {
            System.out.println(teller.tellLifeStory());
        }

    }
}
