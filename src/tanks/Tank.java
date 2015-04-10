/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tanks;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/**
 *
 * @author Anna
 */
public abstract class Tank extends Entity {

    int dx, dy, direction, arrowPressed;
    int moveUp, moveDown, moveLeft, moveRight;
    static ArrayList bullets;
    ImageIcon up;
    ImageIcon up2;
    ImageIcon down;
    ImageIcon down2;
    ImageIcon left;
    ImageIcon left2;
    ImageIcon right;
    ImageIcon right2;
    
    ImageIcon upA;
    ImageIcon up2A;
    ImageIcon downA;
    ImageIcon down2A;
    ImageIcon leftA;
    ImageIcon left2A;
    ImageIcon rightA;
    ImageIcon right2A;
    
    ImageIcon upB;
    ImageIcon up2B;
    ImageIcon downB;
    ImageIcon down2B;
    ImageIcon leftB;
    ImageIcon left2B;
    ImageIcon rightB;
    ImageIcon right2B;
    
    ImageIcon upC;
    ImageIcon up2C;
    ImageIcon downC;
    ImageIcon down2C;
    ImageIcon leftC;
    ImageIcon left2C;
    ImageIcon rightC;
    ImageIcon right2C;
    Timer moveTimer;

    public Tank(int x, int y) {
        super(x, y);
        bullets = new ArrayList();
        direction = 1;
        arrowPressed = 0;
        moveUp = 0;
        moveDown = 0;
        moveLeft = 0;
        moveRight = 0;
        

    }

    public void movingImage(int move, ImageIcon i1, ImageIcon i2) {

        if (move % 2 == 0) {
            setDominantImage(i1);
        } 
        else {
            setDominantImage(i2);
        }

        

    }

    public void fire(int level) {
            Bullet bullet = new Bullet(x, y, direction, 1);
            bullets.add(bullet);
            
            //if(level > 1 && bullets.size() <2){
              //  bullets.add(bullet);
            //}
            

        //int ammo;

    }

    public static ArrayList getBullets() {
        return bullets;
    }

    public void moveX() {
        x = x + dx;
        /*if (x >= 768 - dominantImage.getHeight(null) - 10) {
         x = 768 - dominantImage.getHeight(null) - 10;
         }
         if (x <= 0) {
         x = 0;
         }*/
        checkLocation();
    }

    public void moveY() {
        y = y + dy;
        /*
         if (y >= 720 - 87) {
         y = 720 - 87;
         }
         if (y <= 0) {
         y = 0;
         }*/
        checkLocation();

    }
    
    public void cantMove(){
        dx = 0;
        dy = 0;
        
    }

    public int getDirection() {
        return direction;
    }

}
