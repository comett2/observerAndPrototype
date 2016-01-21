package prototype;

public class Red extends Color{

    public Red() {
        color = "red";
    }

    @Override
    void paint() {
        System.out.println("Paint red color");
    }
}
