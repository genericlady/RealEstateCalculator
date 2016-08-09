import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;

import java.math.BigDecimal;


public class RealEstateTest {
  BigDecimal landValue = new BigDecimal(250000);
  BigDecimal improvementValue = new BigDecimal(500000);
  String stateName = "New York";
  RealEstate realEstate = new RealEstate(landValue, improvementValue, stateName);

  @Test public void totalRealEstateValue() {
    assertEquals(new BigDecimal(750000), realEstate.totalValue());
  }
}
