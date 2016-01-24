package adapter;

public class LegacyPersonAdapter implements PersonInterface{

    private LegacyPerson legacyPerson;

    public LegacyPersonAdapter(LegacyPerson legacyPerson) {
        this.legacyPerson = legacyPerson;
    }


    @Override
    public String getFirstName() {
        return legacyPerson.getName();
    }

    @Override
    public String getLastName() {
        return legacyPerson.getSurname();
    }

    @Override
    public String getEmail() {
        return legacyPerson.getMail();
    }
}
