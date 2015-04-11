/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tanks;

import java.awt.event.KeyEvent;

/**
 *
 * @author Anna
 */
public class Player extends Tank{
    int goLeft;
    int goRight;
    int goUp;
    int goDown;
    int shoot;
    int level = 1;
    int lives = 2;
    public Player(int x, int y) {
        super(x, y);
        

    }
    
    public int getLevel(){
        return level;
    }
    
    public int getLives(){
        return lives;
    }
    
    public void lostALife(){
        if(lives > 0){
            lives--;
        }
    }
    
    public void gotALife(){
        lives++;
    }
    
    public void setLevel(int l){
        if (l >4){
            level = 4;
        }
        else{
            level = l;
        }
        
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == goLeft) {
            if (arrowPressed == 0) {
                arrowPressed = 1;
            }
            if (arrowPressed == 1) {
                dx = -1;
                if (level == 1){
                movingImage(moveLeft, left, left2);
                }
                if (level == 2){
                movingImage(moveLeft, leftA, left2A);
                }
                if (level == 3){
                movingImage(moveLeft, leftB, left2B);    
                }
                if (level == 4){
                    movingImage(moveLeft, leftC, left2C);
                }
                moveLeft++;
                direction = 3;
                
            }

        }
        if (key == goRight) {
            if (arrowPressed == 0) {
                arrowPressed = 2;
            }
            if (arrowPressed == 2) {
                dx = 1;
                if (level == 1){
                movingImage(moveRight, right, right2);
                }
                if (level == 2){
                movingImage(moveRight, rightA, right2A);
                }
                if (level == 3){
                    movingImage(moveRight, rightB, right2B);
                }
                if (level == 4){
                    movingImage(moveRight, rightC, right2C);
                }
                
                moveRight++;
                direction = 4;
                
            }
        }
        if (key == goUp) {

            if (arrowPressed == 0) {
                arrowPressed = 3;
            }
            if (arrowPressed == 3) {
                dy = -1;
                if (level == 1){
                movingImage(moveUp, up, up2);
                }
                if (level == 2){
                   movingImage(moveUp, upA, up2A); 
                }
                if (level == 3){
                    movingImage(moveUp, upB, up2B);
                }
                if (level == 4){
                    movingImage(moveUp, upC, up2C);
                }
                moveUp++;
                direction = 1;
            }

        }
        if (key == goDown) {
            if (arrowPressed == 0) {
                arrowPressed = 4;
            }
            if (arrowPressed == 4) {
                dy = 1;
                if (level == 1){
                    movingImage(moveDown, down, down2);
                
                }
                if (level == 2){
                    movingImage(moveDown, downA, down2A);
                
                }
                if (level == 3){
                    movingImage(moveDown, downB, down2B);
                }
                if (level == 4){
                    movingImage(moveDown, downC, down2C);
                }
                direction = 2;
                moveDown++;
            }

        }
        if (key == shoot) {
            fire(level);

        }

}
    
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == goLeft) {
            dx = 0;
            arrowPressed = 0;
        }
        if (key == goRight) {
            dx = 0;
            arrowPressed = 0;
        }
        if (key == goUp) {
            dy = 0;
            arrowPressed = 0;
        }
        if (key == goDown) {
            dy = 0;
            arrowPressed = 0;
        }

    }
    
}
