package prototype;

public class Main {
    public static void main(String args[]) {
        ColorCache.loadCache();

        Color red = ColorCache.getColor("red");
        red.paint();

        Color green = ColorCache.getColor("green");
        green.paint();
    }
}
