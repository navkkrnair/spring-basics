package com.wipro.bean.modes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Concert {
	@Autowired
	private Singer singer;

	public void startPlay() {
		singer.sing();
	}

	public Singer getSinger() {
		return singer;
	}

}
