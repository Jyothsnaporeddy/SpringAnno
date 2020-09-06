package com.spring.SpringAnno;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary

public class MediaTek implements MoblieProcessor {

	public void process() {
		System.out.println(" 2nd World best CPU");

	}

}
