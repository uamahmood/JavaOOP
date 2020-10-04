public class Galaxy extends Phone implements Ringable{
	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}
	public String ring() {
		String str = ("Galaxy "+ this.getVersionNumber() + " says "+ this.getRingTone());
		return str;
	}
	public 	String unlock() {
		String str = "Unlocking via finder print";
		return str;
	}
	public 	void displayInfo() {
		String str = ("Galaxy "+this.getVersionNumber()+" from " + this.getCarrier());
		System.out.println(str);
	}
}