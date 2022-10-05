package com.example;

public class HockeyPlayer extends Players {

	@Override
	public boolean checkPlayer(Players p) {
		// TODO Auto-generated method stub
		if (p.getAge() >= 18) {
			return true;
		} else {
			return false;
		}
	}

}
