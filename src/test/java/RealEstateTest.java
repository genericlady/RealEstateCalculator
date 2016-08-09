import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.math.BigDecimal;


public class RealEstateTest {
  BigDecimal landValue = new BigDecimal(250000);
  BigDecimal improvementValue = new BigDecimal(500000);
  String stateName = "New York";
  RealEstate realEstate = new RealEstate(landValue, improvementValue, stateName);

  @Test public void totalRealEstateValue() {
    assertEquals(new BigDecimal(750000), realEstate.totalValue());
  }

  @Test public void hasCountyNameAndTaxRate() {
    County county = new County('Queens County', 3);
    realEstate.setCounty(county);
    assertEquals('Queens County', realEstate.getCountyName());
    assertEquals(3, realEstate.getCountyTaxRate());
  }

  @Test public void hasCityNameAndTaxRate() {
    City city = new City('Astoria', 2);
    realEstate.setCity(city);
    assertEquals('Astoria', realEstate.getCityName());
    assertEquals(2, realEstate.getCityTaxRate());
  }

  @Test public void hasSchoolDistrictNameAndTaxRate() {
    SchoolDistrict schoolDistrict = new SchoolDistrict('District #30', 1);
    schoolDistrict.setSchoolDistrict(schoolDistrict);
    assertEquals('District #30', schoolDistrict.getSchoolDistrictName());
    assertEquals(1, schoolDistrict.getSchoolDistrictTaxRate());
  }
}
