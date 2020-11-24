package com.parkgaram.dp.strategy;



// strategy pattern : 여러 알고리즘을 하나의 추상적인 접근점을 만들어 접근점에서 서로 교환 가능하도록 하는 패턴
//
public class Application {

	public static void main(String[] args) {
		
		GameCharacter character = new GameCharacter();
		
		character.setWeapon(new Sword());
		character.attact();
		
		character.setWeapon(new Ax());
		character.attact();
		
		character.setWeapon(new Knife());
		character.attact();
	}
	
}
