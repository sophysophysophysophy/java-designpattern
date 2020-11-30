package com.parkgaram.observer;

import com.parkgaram.observer.Observable.Observer;

public class Button {

	//	멤버 변수로 재선언하여 사용 : delegate
	public Button() {
		observable = new Observable<String>();
	}

	private Observable<String> observable;

	// delegate (observable의 addObserver로 위임)
	public void addObserver(Observer<String> o) {
		observable.addObserver(o);
	}


	// delegate
	public void notifyObservers() {
		observable.notifyObservers(null);
	}

	public void onClick() {
		observable.setChanged();
		notifyObservers();
	}

}
