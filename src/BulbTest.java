import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BulbTest {

	Bulb bulb;
	@Before
	public void setUp() throws Exception 
	{
		bulb = new Bulb(50);
	}

	@Test
	public void test() 
	{
		assertEquals(50,bulb.getBulbWatts());
	}

}
