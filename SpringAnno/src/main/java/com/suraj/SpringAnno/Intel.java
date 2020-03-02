package com.suraj.SpringAnno;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Intel implements MobileProcessor {
	public void process() {
		System.out.println("Another best processor.");		
	}
}
