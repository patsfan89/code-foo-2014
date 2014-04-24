package model;

public abstract class vehicle {
	protected Integer lane;
	protected String color;
	protected double waitTime;
	protected String licensePlate;
	
	/**
	 * Create the vehicle object with the default attributes
	 * 
	 * @param theLane
	 * @param theColor
	 * @param theWaitTime
	 */
	public vehicle(Integer theLane, String theColor, Double theWaitTime, String theLicensePlate){
		this.lane = theLane;
		this.color = theColor;
		this.waitTime = theWaitTime;
		this.licensePlate = theLicensePlate;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public Integer getLane() {
		return lane;
	}

	public void setLane(Integer lane) {
		this.lane = lane;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWaitTime() {
		return waitTime;
	}

	public void setWaitTime(double waitTime) {
		this.waitTime = waitTime;
	}
	
}
