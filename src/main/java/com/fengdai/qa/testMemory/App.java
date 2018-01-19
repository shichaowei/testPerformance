package com.fengdai.qa.testMemory;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) throws InterruptedException
    {
    	int i=0;
    	while (i<10000) {
    		System.out.println(i);
			Animal pre= new Animal();
			pre.setName("aaa");
			pre=null;
			Thread.sleep(1000);
			Person person = new Person.Builder().name("a").age(23).build();
			System.out.println(person);
			person=null;
			i++;
		}


    }
}
