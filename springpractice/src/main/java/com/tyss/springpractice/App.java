package com.tyss.springpractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = 
    			new ClassPathXmlApplicationContext("samsung.xml"); 
    	
     AppConfig s8 = context.getBean(AppConfig.class);
     System.out.println(s8.getMsg());
     
AppConfig appconfig = (AppConfig) context.getBean("samsung");
     System.out.println(appconfig.getMsg());
//       Samsung s7 = new Samsung();
//       s7.config();
    }
}
