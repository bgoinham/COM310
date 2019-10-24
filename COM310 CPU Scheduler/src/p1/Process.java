package p1;

public class Process {

	private int id;
	private int burstTime;

	public Process(int id, int burstTime) {
		super();
		this.id = id;
		this.burstTime = burstTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBurstTime() {
		return burstTime;
	}

	public void setBurstTime(int burstTime) {
		this.burstTime = burstTime;
	}

	@Override
	public String toString() {
		return "Process [id=" + id + ", burstTime=" + burstTime + "]";
	}
	
	

}
