package com.company;

import org.w3c.dom.Text;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class Main {
                            //JAVA SPAM BOT
    public static void main(String[] args) throws AWTException, InterruptedException {
        // write your code here
        int send = 1;
        Robot robot = new Robot();
        Scanner bot = new Scanner(System.in);
        System.out.println("Enter your text");
        String text = bot.nextLine();

        StringSelection stringSelection = new StringSelection(text);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
        System.out.println("The spamming will begin in 5 seconds");
        Thread.sleep(7000);
        while (send <= 1) {
            Thread.sleep(1000);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_V);

            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyPress(KeyEvent.VK_ENTER);
            send ++;
        }
    }
}