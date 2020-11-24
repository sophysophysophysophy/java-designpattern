package com.parkgaram.dp.prototype;


// Object에서 이미 Cloneable 인터페이스 제공
class A implements Cloneable{
	public int x, y;

	//	cloneable interface method
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}