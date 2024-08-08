package TestNG;

import org.testng.annotations.Test;

public class Priority {
@Test(priority=2)
public void searchTest()
{
	System.out.println("serach Test");
}
@Test(priority=1)
public void adddtocart()
{
	System.out.println("add to cart");
}

@Test(priority=0)
public void checkout()
{
	System.out.println("checkout");
}
@Test(priority = 3)
public void orderTest()
{
	System.out.println(" Order Test");
}
@Test(priority = 4)
public void payement()
{
	System.out.println("Payement Test");
}
@Test(priority = 5)
public void OrderTest()
{
	System.out.println("Order Test");
}



}
