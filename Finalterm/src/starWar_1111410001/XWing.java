package starWar_1111410001;

import java.util.Arrays;

public class XWing extends AirCraft{

	
	protected String[] Shield;
	protected double[] ShieldPower;
	
	
	@Override
	public String toString() {
		return "XWing [Shield=" + Arrays.toString(Shield) + ", ShieldPower=" + Arrays.toString(ShieldPower) + "]";
	}
	
	public XWing(String manufacturer, String Model, double Length, double AirSpeed, String SpaceSpeed,
			String StdandardEngine, String HyperSpaceEngine, String[] Weapon, Double[] Weapon_power, int Passenger) {
		super(manufacturer, Model, Length, AirSpeed, SpaceSpeed, StdandardEngine, HyperSpaceEngine, Weapon, Weapon_power,
				Passenger);
		this.setShield(Weapon);
		this.setShieldPower(ShieldPower);
	}
	public String[] getShield() {
		return Shield;
	}
	public void setShield(String[] shield) {
		Shield = shield;
	}
	public double[] getShieldPower() {
		return ShieldPower;
	}
	public void setShieldPower(double[] shieldPower) {
		ShieldPower = shieldPower;
	}
	public Double[] getWeapon_power() {
		return Weapon_power;
	}
	public void setWeapon_power(Double[] weapon_power) {
		Weapon_power = weapon_power;
	}

	
}
