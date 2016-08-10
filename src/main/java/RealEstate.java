import java.math.BigDecimal;

class RealEstate {
  private long landValue = 0;
  private long improvementValue = 0;
  private String stateName;

  public RealEstate(long landValue, long improvementValue, String stateName) {
    this.landValue = landValue;
    this.improvementValue = improvementValue;
    this.stateName = stateName;
  }

  public long totalValue() {
    return landValue + improvementValue;
  }

}
