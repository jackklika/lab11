package lab11;

import java.awt.GridLayout;

import javax.swing.*;

public class Main {

	public static Thread sensorArray[];
	
	public static void main(String[] args) throws InterruptedException {
		
		
		sensorArray = new Thread[8];
		
		
		
		for (int i = 0; i < 8; i++){
			sensorArray[i] = (new Thread(new Sensor("Sensor" + i)));
			sensorArray[i].start();
		}
		
		JFrame frame = new SensorView();
		frame.show();
		

		sensorArray[7].join();

		boolean exit = false;
		
		final int sleepTime = 500;
		
		while (exit == false){
			for (Thread t : sensorArray){
				System.out.printf("%s sleeping for %dms\n", t.getName(), sleepTime); t.sleep(sleepTime); 
			}
		}
		
	}

	
	static class SensorView extends JFrame{
		public SensorView() {
			setTitle("Sensor View");
			setSize(300, 300);
			setLocation(10, 200);
			GridLayout layout = new GridLayout(0,2);
			this.setLayout(layout);
			
			
			JButton buttonArray[] = new JButton[8];
			for (int i = 0; i < sensorArray.length; i++){
				buttonArray[i] = new JButton("Sensor"+i);
				this.add(buttonArray[i]);
			}
			
		}
	}
	
}
