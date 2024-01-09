package starWar_1111410001;

import java.util.Arrays;

public class AirCraft {
	protected String manufacturer;
	protected String Model;
	protected double Length;
	protected double AirSpeed;
	protected String SpaceSpeed;
	protected String StdandardEngine;
	protected String HyperSpaceEngine;
	protected String[] Weapon;
	protected Double[] Weapon_power;
	protected int Passenger;
	
public AirCraft(String manufacturer,String Model,double Length,double AirSpeed,String SpaceSpeed
		,String StdandardEngine,String HyperSpaceEngine,String[] Weapon,Double[] Weapon_power,
		int Passenger) {
	this.setManufacturer(manufacturer);
	this.setModel(Model);
	this.setLength(Length);
	this.setAirSpeed(AirSpeed);
	this.setSpaceSpeed(SpaceSpeed);
	this.setStdandardEngine(StdandardEngine);
	this.setHyperSpaceEngine(HyperSpaceEngine);
	this.setWeapon(Weapon);
	this.setWeapon_power(Weapon_power);
	this.setPassenger(Passenger);	
	}

	@Override
public String toString() {
	return "AirCraft [manufacturer=" + manufacturer + ", Model=" + Model + ", Length=" + Length + ", AirSpeed="
			+ AirSpeed + ", SpaceSpeed=" + SpaceSpeed + ", StdandardEngine=" + StdandardEngine + ", HyperSpaceEngine="
			+ HyperSpaceEngine + ", Weapon=" + Arrays.toString(Weapon) + ", Weapon_power="
			+ Arrays.toString(Weapon_power) + ", Passenger=" + Passenger + "]";
}

	public AirCraft() {}
	public String getManufacturer() {
		return manufacturer;
	}


	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}


	public String getModel() {
		return Model;
	}


	public void setModel(String model) {
		Model = model;
	}


	public double getLength() {
		return Length;
	}


	public void setLength(double length) {
		Length = length;
	}


	public double getAirSpeed() {
		return AirSpeed;
	}


	public void setAirSpeed(double airSpeed) {
		AirSpeed = airSpeed;
	}


	public String getSpaceSpeed() {
		return SpaceSpeed;
	}


	public void setSpaceSpeed(String spaceSpeed) {
		SpaceSpeed = spaceSpeed;
	}


	public String getStdandardEngine() {
		return StdandardEngine;
	}


	public void setStdandardEngine(String stdandardEngine) {
		StdandardEngine = stdandardEngine;
	}


	public String getHyperSpaceEngine() {
		return HyperSpaceEngine;
	}


	public void setHyperSpaceEngine(String hyperSpaceEngine) {
		HyperSpaceEngine = hyperSpaceEngine;
	}


	public String[] getWeapon() {
		return Weapon;
	}


	public void setWeapon(String[] weapon) {
		Weapon = weapon;
	}


	public Double[] getWeapon_power() {
		return Weapon_power;
	}


	public void setWeapon_power(Double[] weapon_power) {
		Weapon_power = weapon_power;
	}


	public int getPassenger() {
		return Passenger;
	}


	public void setPassenger(int passenger) {
		Passenger = passenger;
	}


	
	
}
