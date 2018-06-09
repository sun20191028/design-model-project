package net.dp.adapter.turkey.impl;

import net.dp.adapter.ducks.Duck;
import net.dp.adapter.turkey.Turkey;

public class TurkeyAdapter implements Duck {
	Turkey turkey;

	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}

	public void quack() {
		turkey.gobble();
	}

	public void fly() {
		for (int i = 0; i < 5; i++) {
			turkey.fly();
		}
	}
}
