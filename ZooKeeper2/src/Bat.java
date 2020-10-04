public class Bat extends Mammal{
	public Bat(){
		this.setEnergy(300);
	}
	public void fly() {
		this.setEnergy(this.getEnergy()-50);
		int this_energy = this.getEnergy();
		if (this_energy >0)
			System.out.println("Whoosh!");			
		else {this.setEnergy(0);
			System.out.println("*Plop*");}
	}
	public void eatHumans() {
		this.setEnergy(this.getEnergy()+25);
		System.out.println("Crunch!");
	}
	public void attackTown() {
		this.setEnergy(this.getEnergy()-100);
		int this_energy = this.getEnergy();
		if (this_energy >0)
			System.out.println("BOOM!");			
		else {this.setEnergy(0);
			System.out.println("*Crickets chirping*");}
	}
}