package MainPackage;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.Test;

@RunWith(JUnit4.class)
public class MyClassTest 
{
	@Test
	public void validateTrue()
	{
		assertTrue("False is returned instead of true!", MyClass.ReturnTrue());
		
	}
	
	@Test
	public void validateNotNull()
	{
		assertNotNull("Null is returned, check your values!", MyClass.AddTwoNumbers(2, 1));
	}

}
