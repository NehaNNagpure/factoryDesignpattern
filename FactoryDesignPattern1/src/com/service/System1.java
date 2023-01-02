package com.service;

import com.factory1.Claim;
import com.factory1.Insurance;
import com.factory1.Policy;
import com.factory1.Premium;

public class System1 {
	public Insurance getObject(String name)
	{
		if(name.equalsIgnoreCase("Policy"))
		{
			return new Policy();
		}
		else if(name.equalsIgnoreCase("claim"))
		{
			return new Claim();
		}
		else 
		{
			return new Premium();
		}
	}

}
