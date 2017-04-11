package lab11;

public class Sensor implements Runnable {

	public String sensorName;
	public Thread sensorThread;
	
	public Sensor(String sensorName){
		this.sensorName = sensorName;
		sensorThread = new Thread();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
