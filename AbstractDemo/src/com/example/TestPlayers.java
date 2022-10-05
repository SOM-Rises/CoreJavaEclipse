package com.example;

import java.util.Scanner;

public class TestPlayers {

	// method for check eligible or not
	static void callPlayer(Players p) {

		boolean status;
		status = p.checkPlayer(p);

		if (status) {
			System.out.println(p.getName() + " " + "age" + " " + p.getAge() + " " + "is eligible to play");
		} else {
			System.out.println(p.getName() + " " + "age" + " " + p.getAge() + " " + "is not eligible to play");

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		FootballPlayer f = new FootballPlayer(); // refernce and object of the FootballPlayer

		System.out.println("Footballer Name: ");
		f.setName(sc.next());

		System.out.println("Footballer age: ");
		f.setAge(sc.nextInt());
		callPlayer(f);

		HockeyPlayer h = new HockeyPlayer(); // refernce and object of the Hockeyplayer

		System.out.println("Hocky Player Name: ");
		h.setName(sc.next());

		System.out.println("Hocky Player age: ");
		h.setAge(sc.nextInt());
		callPlayer(h);

	}

}
