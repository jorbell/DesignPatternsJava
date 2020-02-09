package creational.observer;
import java.util.Observer;
import java.util.Observable;

public class DigitalClock implements Observer {
	private ClockTimer timer;
	
	public DigitalClock(ClockTimer timer) {
		this.timer = timer;
		this.timer.addObserver(this);
		//subject.addObserver(this);
	}
	public void update(Observable o, java.lang.Object arg) {
		// TODO Auto-generated method stub
		if (o == timer) {
			printTime();
		}
		
	}


	private void printTime() {
		System.out.println(timer.getHour() + ":" + timer.getMinute() +":"+timer.getSecond());
	}




}
