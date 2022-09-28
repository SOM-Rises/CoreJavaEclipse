package com.main;

import com.inheritDemo.ElectricalCycle;

public class CycleTest {

//	static void display(MountainCycle s, Cycle c) {
//		System.out.println(c);
//		System.out.println(s);
//		System.out.println();
//	}

	static void display(ElectricalCycle s) {
		System.out.println(s);
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Cycle c1 = new Cycle("Alloy", 3, 67000.90, "Firefox");
//		MountainCycle cycle1 = new MountainCycle("Alloy", 3, 60000.90, "Firefox", 6, 35);
//
//		Cycle c2 = new Cycle("Shimano", 3, 55000.90, "Atlas");
//		MountainCycle cycle2 = new MountainCycle("Shimano", 3, 55000.90, "Atlas", 5, 30);

//		MountainRacing cycle3 = new MountainRacing("Alloy", 3, 67000.90, "Firefox", 5, 30, true, "LED", "NOS");

		ElectricalCycle cycle4 = new ElectricalCycle("Rim wheels", 2, 25000.50, "Avon", "Lithium");
		display(cycle4);
//		display(cycle1, c1);
//		display(cycle2, c2);
	}

}

//"Alloy", 3, 67000.90, "Firefox", 5, 30