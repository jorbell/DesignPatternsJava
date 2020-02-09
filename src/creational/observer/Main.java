package creational.observer;
import java.util.Observer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClockTimer timer = new ClockTimer(15, 23, 55);
		Observer digi = new DigitalClock(timer);

		timer.addObserver(digi);
		Thread t = new Thread(timer);
		t.start();

	}

}
