package Abstraction;

interface VoiceControlled{
	public void respondToVoiceCommand(String Command);
}

abstract class SmartDevice{
	protected String deviceID;
	protected String deviceName;
	public SmartDevice(String deviceID, String deviceName) {
		this.deviceID = deviceID;
		this.deviceName = deviceName;
	}
	public void turnOn()
	{
		System.out.println(deviceName+" is turning on...");
	}
	public void turnOff()
	{
		System.out.println(deviceName+" is turning off...");
	}
	public abstract void performPrimaryFunction();
}

class SmartLight extends SmartDevice implements VoiceControlled{
	int brightnessLevel;
	public SmartLight(String deviceID, String deviceName, int brightnessLevel) {
		super(deviceID, deviceName);
		this.brightnessLevel = brightnessLevel;
	}
	@Override
	public void performPrimaryFunction()
	{
		 System.out.println(deviceName+" is shining at "+brightnessLevel+"% brightness.");
	}
	@Override
	public void respondToVoiceCommand(String Command)
	{
		if(Command.equals("dim"))
			{
			  brightnessLevel-=20;
			  if(brightnessLevel < 0) brightnessLevel = 0;
			  System.out.println("Dimming "+deviceName+" to "+brightnessLevel+"%.");
			}
		else System.out.println("Sorry, "+deviceName+" does not understand that command.");
	}
}

class SmartThermostat extends SmartDevice{
	int targetTemperature;
	SmartThermostat(String deviceID, String deviceName, int targetTemperature) {
		super(deviceID, deviceName);
		this.targetTemperature = targetTemperature;
	}
	@Override
	public void performPrimaryFunction()
	{
		System.out.println(deviceName+" is cooling/heating the room to "+targetTemperature+" degrees.");
	}
}
public class MySmartHome {
     public static void main(String[] args) {
    	 SmartLight s = new SmartLight("100", "Living Room Light", 80);
    	 SmartDevice st = new SmartThermostat("101", "Bedroom AC", 22);
    	 s.turnOn();
    	 s.performPrimaryFunction();
    	 s.respondToVoiceCommand("dim");
    	 s.performPrimaryFunction();
    	 st.turnOn();
    	 st.performPrimaryFunction();
     }
}
