package lab11;

public class Sensor implements Runnable {

	public String sensorName;
	public Thread sensorThread;
	
	public Sensor(String sensorName){
		this.sensorName = sensorName;
		System.out.printf("%s Created\n", sensorName);
	}

	@Override
	public void run() {
		 System.out.printf(" %s Started\n", sensorName);
		
	}
	
}
