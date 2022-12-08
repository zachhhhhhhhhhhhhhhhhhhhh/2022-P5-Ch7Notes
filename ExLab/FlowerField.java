package ExLab;
import java.awt.*;
import java.applet.*;
//class that draws flowers
public class FlowerField extends Applet{
    public void paint(Graphics g) {

          Background.drawGround(g, 200, 500);
          Background.drawSky(g, 200, 450);

            Clouds.drawHappycloud(g);
            Clouds.drawAngrycloud(g);
            Clouds.drawSadcloud(g);



        Flower.drawPetal(g);
        Flower.drawStem(g);
        Flower.drawLeaves(g);
        Flower.drawRoots(g);



}












}
