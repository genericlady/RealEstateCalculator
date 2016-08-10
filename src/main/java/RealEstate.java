import java.math.BigDecimal;

class RealEstate {
  private BigDecimal landValue = new BigDecimal(0);
  private BigDecimal improvementValue = new BigDecimal(0);
  private String stateName;

  private County county;
  private City city;
  private SchoolDistrict schoolDistrict;

  public RealEstate(BigDecimal landValue, BigDecimal improvementValue, String stateName) {
    this.landValue = landValue;
    this.improvementValue = improvementValue;
    this.stateName = stateName;
  }

  public BigDecimal totalValue() {
    return landValue.add(improvementValue);
  }

  public void setCounty(County county) {
    this.county = county;
  }

  public void setCity(City city) {
    this.city = city;
  }

  public void setSchoolDistrict(SchoolDistrict schoolDistrict) {
    this.schoolDistrict = schoolDistrict;
  }

}
