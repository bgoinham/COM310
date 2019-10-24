package p1;

import java.util.ArrayList;

public class FCFSProcessBag {
	private ArrayList<Process> bag;
	
	

	public FCFSProcessBag() {
		super();
		bag = new ArrayList<Process>();
	}

	public ArrayList<Process> getBag() {
		return bag;
	}

	public void setBag(ArrayList<Process> bag) {
		this.bag = bag;
	}
	
	public void addProcess(Process process) {
		
		bag.add(process);
	}

	public Process searchByID(int id) {
		for (int i = 0; i < bag.size() - 1; i++) {
			if (id == bag.get(i).getId()) {
				return bag.get(i);
			}

		}
		return null;
	}

	public double calculateWaitTime(int processID) {
		int burstTime = 0;
		for(int i = 0; i < processID - 1; i++) {
			burstTime += bag.get(i).getBurstTime() ;
			
		}
		return burstTime;
	}
	
	public double calculateAverageWaitTime() {
		double totalBurstTime = 0;
		double size = 0;
		for(int i = 0; i < bag.size(); i++) {
			totalBurstTime += calculateWaitTime(i + 1);
			size++;
		}
		return totalBurstTime/size;
		
	}
	
	public double calculateTurnAroundTime(int processID) {
		double turnAroundTime = 0;
		for(int i = 0; i < processID; i++) {
			turnAroundTime += bag.get(i).getBurstTime();
		}
		return turnAroundTime;
	}

}
