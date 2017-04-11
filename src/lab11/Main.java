package lab11;

public class Main {

	public static void main(String[] args) {
		
		Thread sensorArray[] = new Thread[8];
		
		for (int i = 0; i < 8; i++){
			sensorArray[i] = (new Thread(new Sensor("Sensor" + i)));
			sensorArray[i].start();
		}
		
		try {
			sensorArray[7].join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
