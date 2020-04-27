package com.capgemini.springcoreassign;

/**
 * Hello world!
 *
 */
public class App 
{
//    public static void main( String[] args )
//    {
//        System.out.println( "Hello World!" );
//    }
//}
	public static void main(String[] args) {
		 ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		 MessageBean msgBean=context.getBean(MessageBean.class);
		 msgBean.print();
		
	}
