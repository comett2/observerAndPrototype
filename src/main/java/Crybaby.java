public class Crybaby extends Observer {

    public Crybaby(Theatre theatre) {
        this.theatre = theatre;
        this.theatre.attach(this);
    }

    @Override
    void reactOnArtType() {
        System.out.println("Cry when watching" + theatre.getArtType());
    }
}
