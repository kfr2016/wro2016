package de.kfr.wro2016;

import de.kfr.wro2016.linefolower.Controller;
import lejos.hardware.Button;
import lejos.hardware.lcd.LCD;
import lejos.hardware.motor.Motor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.utility.Delay;

public class Run {

	public static void main(String[] args) {
		 LCD.drawString("Tutor 4", 0, 0);
		            Button.waitForAnyPress();
		            while(Button.readButtons()>0);
		            LCD.clear();
		            Controller controller = new Controller(SensorPort.S1, MotorPort.B, MotorPort.C);

		            controller.run();
		  
		            Button.waitForAnyPress();     
	}

}
