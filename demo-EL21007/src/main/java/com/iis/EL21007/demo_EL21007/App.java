package com.iis.EL21007.demo_EL21007;

/**
 * Hello world!
 *
 */
public class App 
{
	public String Hello() {
		return "Hellow World";
	}
    public static void main( String[] args )
    {
    	App hw = new App ();
        System.out.println(hw.Hello() );
    }	
}
