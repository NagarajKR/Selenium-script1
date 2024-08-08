package TestNG;

import org.testng.annotations.Test;

public class Invocation {
@Test(invocationCount=10)
public void adduserTest()
{
	System.out.println("adding user test");
}
}
