import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;

public class RealEstateCalculatorTest {

  String stateName = "New York";
  County county = new County("Queens", 0.2);
  City city = new City("Astoria", 0.2);
  SchoolDistrict schoolDistrict = new SchoolDistrict("District #33", 0.149);
  long landValue = 250000;
  long improvementValue = 1000000;

  RealEstate realEstate = new RealEstate(landValue, improvementValue, stateName);
  RealEstateCalculator realEstateCalculator = new RealEstateCalculator();

  @Test
  public void convertsPercentToDecimal() {
    double percent = county.getTaxRatePercentage() + city.getTaxRatePercentage() + schoolDistrict.getTaxRatePercentage();
    double decimal = realEstateCalculator.convertPercentToDecimal(percent);
    assertEquals(0.00549, decimal, 0.0f);
  }

  @Test
  public void calculatesEstimatedTaxes() {
    long totalRealEstateValue = realEstateCalculator.totalRealEstateValue(landValue, improvementValue);
    double totalTaxRate = realEstateCalculator.totalTaxRate(county, city, schoolDistrict);

    double estimatedTaxes = realEstateCalculator.calculateTaxes(totalRealEstateValue, totalTaxRate);
    assertEquals(6862.5, estimatedTaxes, 0.0f);
  }
}

// 1250000 * 0.00549
