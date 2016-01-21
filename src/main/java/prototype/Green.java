package prototype;

public class Green extends Color {

    public Green() {
        color = "green";
    }

    @Override
    void paint() {
        System.out.println("Paint green color");
    }
}
