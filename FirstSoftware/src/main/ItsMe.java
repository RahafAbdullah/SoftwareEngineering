package main;


/**
* The ItsMe program implements an application that
* simply displays "Hello" to the standard output.
*
* @author  Rahaf Abdullah
* @version 1.0
* @since   2019-01-25 
*/
public class ItsMe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Hello everyone ..."+"I'm Rahaf Abdullah ...");
        System.out.println("Good Day ...");
        
	}

}
class Basic
{
public void greetMe(String name)
{
	System.out.println("Welcome here, "+name+" !!!");
}
}
class Derived extends Basic
{
@Override
public void greetMe(String name)
{
	System.out.println("Welcome "+name+" !!!");
}
}
