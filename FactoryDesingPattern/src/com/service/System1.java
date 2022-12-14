package com.service;

import com.factory.Booking;
import com.factory.Bus;
import com.factory.Plane;
import com.factory.Train;

public class System1 {

	public Booking getObject(String name)
	{
		if(name.equalsIgnoreCase("plane"))
		{
			return new Plane();
		}
		else if(name.equalsIgnoreCase("bus"))
			{
				return new Bus();
			}
		else 
		{
			return new Train();
		}
			
	}
	

}
