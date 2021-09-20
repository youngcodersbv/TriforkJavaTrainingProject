package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld {
    public static Logger logger = LoggerFactory.getLogger(HelloWorld.class);

    public static void main(String[] args) {

        logger.warn("HelloWorld");

        ContretePerson kees = new ContretePerson("Kees Kaas", 43);
        ContretePerson jan = new VeryImportantPerson("Jan Smit", 48);

        List<AbstractPerson> people = new ArrayList<>();
        people.add(kees);
        people.add(jan);

        List<StoryTeller> tellers = new ArrayList<>();
        tellers.add(kees);
        tellers.add(jan);

        for (AbstractPerson person: people) {
            logger.info(String.format("Ik ben %s", person.getName()));
        }

        for (StoryTeller teller: tellers) {
            logger.info(teller.tellLifeStory());
        }

    }
}
