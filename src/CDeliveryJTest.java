import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class CDeliveryJTest {
	CDelivery Cobj = new CDelivery();

	@Test
	public void PriceForDistanceLessThan10KM() {
		Assert.assertEquals(10, Cobj.PriceForDistance(8));
	}

	@Test
	public void PriceForDistanceGreaterThan10KM() {
		Assert.assertEquals(25, Cobj.PriceForDistance(12));
	}
	@Test
	public void PriceForDistanceAndStairsThan10KM() {
		Assert.assertEquals(35, Cobj.PriceForDistanceAndStairs(12));
	}
	
}