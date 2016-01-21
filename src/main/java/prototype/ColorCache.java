package prototype;

import java.util.Hashtable;

public class ColorCache {

    private static Hashtable<String, Color> colorMap = new Hashtable<String, Color>();

    public static Color getColor(String color) {
        Color cachedColor = colorMap.get(color);
        return (Color) cachedColor.clone();
    }

    public static void loadCache() {
        colorMap.put("red", new Red());
        colorMap.put("green", new Green());
    }
}
