package com.umer.assignment;

public class HumanTest {
	public static void main(String[]args) {
		Wizard wizard = new Wizard();
		Ninja ninja = new Ninja ();
		Samurai samurai= new Samurai();

//test wizard
		System.out.println("** Start testing wizard **");
		wizard.attack(ninja);
		ninja.displayHealth(); //1007 test wizard attack (-3)
		wizard.fireball(ninja);
		ninja.displayHealth(); //983 test wizard fireball(-3*8)
		
//test ninja
		ninja.displayHealth();
		System.out.println("** Start testing ninja **");
		ninja.attack(samurai);
		samurai.displayHealth(); //1007 test ninja attack (-3)
		ninja.steal(samurai);
		samurai.displayHealth(); //1007 test ninja steal(-10)
		ninja.displayHealth();
		System.out.println("** Start testing ninja.stealth() **");
		samurai.displayHealth(); //1015 test ninja steal(-10)
		ninja.runAway();
		ninja.displayHealth(); //991 test wizard fireball(-3*8)

//test samurai
		samurai.displayHealth();
		System.out.println("** Start testing samurai **");
		samurai.attack(wizard);
		wizard.displayHealth(); //1007 test samuraiattack (-3)
		samurai.deathBlow(wizard);
		wizard.displayHealth(); //1015 test samuraiheal (+8)
		samurai.displayHealth();
		samurai.meditate();
		samurai.displayHealth();
		Samurai.howMany();
	}
}
