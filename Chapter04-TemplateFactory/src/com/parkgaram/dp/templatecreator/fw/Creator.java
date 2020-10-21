package com.parkgaram.dp.templatecreator.fw;


// framework
// creator : 데이터베이스에서 아이템 정보 읽기 -> 아이템 생성 -> 생성한 로그 데이터베이스에 저장
// 템플릿 메소드 패턴 이용됨
public abstract class Creator {

	public Item create(String itemName){
		
		init(itemName);
		Item item = createItem(itemName);
		end(itemName);
		
		return item;
	}

//	아이템 생성 후 데이터베이스에 로그 저장
	abstract protected String end(String itemName);

//	아이템 생선 전 데이터베이스에 아이템 정보 요청
	abstract protected String init(String itemName);

//	아이템 생성하는 알고리즘
abstract protected Item createItem(String itemName);
	
}
