package lab11;

public class Main {

	public static void main(String[] args) {
		
		Sensor sensorArray[] = new Sensor[8];
		
		for (int i = 0; i <=8 ; i++){
			sensorArray[i] = new Sensor("Sensor " + i);
		}
	}

}
