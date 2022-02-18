import processing.core.PApplet;

public class SnekSketch extends PApplet {
    public void settings() {
        size(640, 480);
    }

    public void draw() {

    }

    public void setup() {
        windowTitle("Data Snek");
    }

    public static void main(String... args){
        String[] processingArgs = {"Data Snek"};
        SnekSketch snekSketch = new SnekSketch();
        PApplet.runSketch(processingArgs, snekSketch);
    }
}