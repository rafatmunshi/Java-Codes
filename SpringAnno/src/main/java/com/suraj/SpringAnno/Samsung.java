package com.suraj.SpringAnno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component  //Non qualified and decapitalize 
public class Samsung {
	
	@Autowired
	@Qualifier("intel")
	private MobileProcessor cpu;
	
	@Autowired
	@Qualifier("snapdragon")
	private MobileProcessor cpu1;
	
	public MobileProcessor getCpu1() {
		return cpu1;
	}
	public void setCpu1(MobileProcessor cpu1) {
		this.cpu1 = cpu1;
	}
	public MobileProcessor getCpu() {
		return cpu;
	}
	public void setCpu(MobileProcessor cpu) {	
		this.cpu = cpu;
	}
	public void config(){
		System.out.println("Octa core, 4gb ram, 12MP camera");
		cpu.process();
		cpu1.process();
	}	
}