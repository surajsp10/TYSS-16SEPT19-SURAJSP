package com.testyantra.accessmodifier.pkg1;

import com.testyantra.accessmodifier.pkg2.Demo;

public class Sample {

	
	Demo d = new Demo();
	
	Sample s = new Sample()
	
	/* System.out.println(d.a); */
	
	//default
	
	System.out.println(d.b);
	d.sub();
	
	//Protected
	
	System.out.println(s.c);
	s.mul();
	
	//Public
	
	System.out.println(d.name);
	d.div();
	
	
	
}
