package ExLab;
import java.awt.*;
import java.applet.*;
public class Background {

    public static void drawBackground(Graphics g, int x, int y){

       drawGround(g, x, y);
       drawSky(g, x, y);



    }





    public static void drawGround (Graphics g, int x, int y){

        g.setColor(Color.green);

        g.fillRect(x, y,50,50);


    }

    public static void drawSky(Graphics g, int x, int y){
        g.setColor(Color.blue);
        g.fillRect(x,y,50,50);



    }




}
