import java.math.BigDecimal;

class RealEstate {
  private BigDecimal landValue = new BigDecimal(0);
  private BigDecimal improvementValue = new BigDecimal(0);
  private String stateName;

  public RealEstate(BigDecimal landValue, BigDecimal improvementValue, String stateName) {
    this.landValue = landValue;
    this.improvementValue = improvementValue;
    this.stateName = stateName;
  }

  public BigDecimal totalValue() {
    return landValue.add(improvementValue);
  }
}
