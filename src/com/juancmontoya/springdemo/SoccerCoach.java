package com.juancmontoya.springdemo;

public class SoccerCoach implements Coach {	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on passing drills";
	}
}
