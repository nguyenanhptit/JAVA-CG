package stopWatch;

import java.util.Date;

public class StopWatch {
	private long startTime = 0;
	private long endTime = 0;
	private boolean running = false;
	
	public long getStartTime() {
		return startTime;
	}


	public void start()  {
		this.startTime = System.currentTimeMillis();
		this.running = true;
	}


	public long getEndTime() {
		return endTime;
	}


	public void stop() {
		this.endTime = System.currentTimeMillis();
		this.running = false;
	}

	public long getElapsedTime() {
		long elapsed;
		if(running) {
			elapsed = ((System.currentTimeMillis() -startTime));
		}else {
			elapsed = (endTime -startTime);
		}
		return elapsed;
		
	}
	

	public StopWatch() {
		super();
		// TODO Auto-generated constructor stub
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	}

}
