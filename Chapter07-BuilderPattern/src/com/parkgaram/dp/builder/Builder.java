package com.parkgaram.dp.builder;

// builder class에 객체 생성 시 필요한 기능 등 정의
// builder class를 상속받은 다양한 타입의 builder들로 실제 객체 생성해냄 !
public abstract class Builder {

	protected Monster monster;
	
	abstract public void setHp();
	abstract public void setAt();
	abstract public void setDf();
	abstract public void setName();
	
	public Monster build(){
		setAt();
		setDf();
		setHp();
		setName();
		return monster;
	};

}
