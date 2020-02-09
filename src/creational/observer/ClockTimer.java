package creational.observer;
import java.util.Observable;
import java.util.Timer;
import java.util.TimerTask;

public class ClockTimer extends Observable implements Runnable {
    private int hour;
    private int minute;
    private int second;
    
    
    public ClockTimer(int hour, int minute, int second) {
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }
    
    
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    void tick() {
        second ++;
        if(second == 60) {
            second = 0;
            minute++;
        }
        if (minute == 60) {
            minute = 0;
            hour++;
        }
        if (hour == 24) {
            hour = 0;
        }
}

    public void run() {
        // TODO Auto-generated method stub
        while (true) {
            tick();
            setChanged();
            notifyObservers(second);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
    }
}
