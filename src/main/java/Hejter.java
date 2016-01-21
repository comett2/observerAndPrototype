public class Hejter extends Observer{

    public Hejter(Theatre theatre) {
        this.theatre = theatre;
        this.theatre.attach(this);
    }

    @Override
    void reactOnArtType() {
        System.out.println("Hejt " + theatre.getArtType());
    }
}
