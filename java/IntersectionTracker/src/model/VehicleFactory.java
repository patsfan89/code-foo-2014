package model;

import java.util.ArrayList;

public class VehicleFactory {
	public vehicle buildCar(){
		// TODO implement factory
		return null;
	}
	
	/**
	 * Build an array list of size n made up of vehicle objects
	 * 
	 * @param theListSize
	 * @return
	 */
	public ArrayList<vehicle> buildVehicleList(Integer theListSize){
		ArrayList<vehicle> vehicles = (ArrayList<vehicle>) new ArrayList<vehicle>();
		for (int i = 0; i < theListSize; i++){
			vehicles.add(buildCar());
		}
		return vehicles;
	}
}
