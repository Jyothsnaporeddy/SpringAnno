package com.spring.SpringAnno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class Samsung {
	
	@Autowired
	@Qualifier("snapdragon")
	MoblieProcessor cpu;
	
	public MoblieProcessor getCpu() {
		return cpu;
	}
	public void setCpu(MoblieProcessor cpu) {
		this.cpu = cpu;
	}
	public void config() {
		System.out.println("Octa Core, 4 GB Ram,12MP Camera");
		cpu.process();
		
	}

}
