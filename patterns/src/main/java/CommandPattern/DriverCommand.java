package CommandPattern;

public class DriverCommand {
	public DriverCommand() {
		System.out.println();
		System.out.println("-----Command_Pattern-----");
		Remotecontrol control = new Remotecontrol();
	    Light light = new Light();
	    Command lightsOn = new LightsOnCmd(light);
	    Command lightsOff = new LightsOffcmd(light);
	    control.setCommand(lightsOn);
	    control.pressButton();
	    control.setCommand(lightsOff);
	    control.pressButton();
	}
}