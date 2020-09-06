package com.spring.SpringAnno;

import org.springframework.stereotype.Component;

@Component
public class Snapdragon implements MoblieProcessor {

	public void process() {
		System.out.println("World best CPU");

	}

}
