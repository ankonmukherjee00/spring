package com.ankon.mukherjee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class car implements vehicle 
{
	@Autowired
	public tyre tyre ;
	
	public tyre getTyre() {
		return tyre;
	}

	public void setTyre(tyre tyre) {
		this.tyre = tyre;
	}

	public void drive() 
	{

	
				System.out.println("car   " + tyre);
	}

}