package main;

import java.io.File;

import lejos.hardware.Button;
import lejos.hardware.Sound;
import lejos.hardware.Sounds;
import lejos.hardware.lcd.LCD;

public class Main {

  public static void main(String[] args) {
    LCD.drawString("HelloWorld", 0, 0);
    Sound.playSample(new File("music/missionimpossible.wav"), Sounds.VOL_MAX);
    Button.waitForAnyPress();
  }
}
