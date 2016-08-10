import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.math.BigDecimal;


public class RealEstateTest {
  BigDecimal landValue = new BigDecimal(250000);
  BigDecimal improvementValue = new BigDecimal(500000);
  String stateName = "New York";
  RealEstate realEstate = new RealEstate(landValue, improvementValue, stateName);

  County county = new County('Queens County', 3);
  City city = new City('Astoria', 2);
  SchoolDistrict schoolDistrict = new SchoolDistrict('District #30', 1);
  
  realEstate.setCounty(county);
  realEstate.setCity(city);
  schoolDistrict.setSchoolDistrict(schoolDistrict);

  @Test public void totalRealEstateValue() {
    assertEquals(new BigDecimal(750000), realEstate.totalValue());
  }

  @Test public void hasCountyName() {
    assertEquals('Queens County', realEstate.getCountyName());
  }

  @Test public void hasCountyTaxRate() {
    assertEquals(3, realEstate.getCountyTaxRate());
  }

  @Test public void hasCityName() {
    assertEquals('Astoria', realEstate.getCityName());
  }

  @Test public void hasCityTaxRate() {
    assertEquals(2, realEstate.getCityTaxRate());
  }

  @Test public void hasSchoolDistrictName() {
    assertEquals('District #30', schoolDistrict.getSchoolDistrictName());
  }

  @Test public void hasSchoolDistrictTaxRate() {
    assertEquals(1, schoolDistrict.getSchoolDistrictTaxRate());
  }
}
