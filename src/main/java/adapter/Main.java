package adapter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]) {
        LegacyPerson legacyPerson = new LegacyPerson();
        legacyPerson.setMail("legacy_person@mail.com");
        legacyPerson.setName("John");
        legacyPerson.setName("Dogget");

        PersonInterface person = new LegacyPersonAdapter(legacyPerson);
        PersonInterface normalPerson = new Person("Arnold", "Schwarzennegegrgerrrr", "arnold@mail.com");

        List<PersonInterface> persons = new ArrayList<>();
        persons.add(person);
        persons.add(normalPerson);
    }
}
