package ExLab;
import java.awt.*;
import java.applet.*;
//class that draws flowers
public class FlowerField extends Applet{
    public void paint(Graphics g) {
            Background.drawBackground(g, 200, 500);
        Background.drawBackground(g, 250, 500);
        Background.drawBackground(g, 300, 500);

            Clouds.drawHappycloud(g);
            Clouds.drawAngrycloud(g);
            Clouds.drawSadcloud(g);



        Flower.drawPetal(g);
        Flower.drawStem(g);
        Flower.drawLeaves(g);
        Flower.drawRoots(g);



}












}
