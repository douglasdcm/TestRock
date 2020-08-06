/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testart;

/**
 *
 * @author TestRock!
 */
import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class testart1 {
  public static void run() throws InterruptedException, AWTException{
    while(true){
      //Thread.sleep(100);
      int x, y;
      x = MouseInfo.getPointerInfo().getLocation().x; 
      y = MouseInfo.getPointerInfo().getLocation().y;
      System.out.println("(" + x + ", " + y + ")");
              Robot robot = new Robot();
              robot.mouseMove(x,y+80);
    }
  }
}
