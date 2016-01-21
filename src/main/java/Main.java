public class Main {

    public static void main(String args[]) {
        Theatre theatre = new Theatre();

        new Hejter(theatre);
        new Crybaby(theatre);

        theatre.setArtType("drama");
        theatre.setArtType("comedy");
    }
}
