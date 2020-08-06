/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package iddinamico;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 *
 * @author TestRock!
 */
public class Interacao {
    
    public static void click(WebDriver driver, WebElement ancora, int offsetX, int offsetY) throws AWTException{
        Robot robot = new Robot();
        Point p = ((WebElement)ancora).getLocation();
        //clica no objeto com ID dinâmico utilizando o objeto ancora
        Actions builder = new Actions(driver);
        builder.moveToElement(ancora, 0, 0).click().perform();
        //robot.mouseMove(p.x + offsetX, p.y + offsetY);    
        //robot.mousePress(InputEvent.BUTTON1_MASK);
        //robot.mouseRelease(InputEvent.BUTTON1_MASK);
    }
    
    public static void write(Object ancora, int offsetX, int offsetY, char texto) throws AWTException{
        //Interacao.click(ancora, offsetX, offsetY);
        Robot robot = new Robot();
        robot.keyPress((byte)texto);
        robot.keyRelease((byte)texto);
    }
    
}
