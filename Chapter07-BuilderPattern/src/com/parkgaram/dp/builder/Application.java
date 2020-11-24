package com.parkgaram.dp.builder;

public class Application {

	public static void main(String[] args) {


		MonsterDirector director = new MonsterDirector();
		
		Builder builder = new ATypeMonsterBuilder();
		director.setBuilder(builder);
		System.out.println("A type builder로 생성한 monster 객체");
		System.out.println(director.gen());

		System.out.println();



		builder = new BTypeMonsterBuilder();
		director.setBuilder(builder);
		Monster monster = director.gen();
		System.out.println("B type builder로 생성한 monster 객체");
		System.out.println(monster);
	}
}
