package com.ruchi.SpringAnno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component 
public class Samsung {
	
	@Autowired 
	@Qualifier("snapdragon")
	Mobileprocess cpu;
	
	public Mobileprocess getCpu() {
		return cpu;
	}

	public void setCpu(Mobileprocess cpu) {
		this.cpu = cpu;
	}

	public void config()
	{
		System.out.println("hgdtrjhtjd");
		cpu.procees();
	}

}
