import java.math.BigDecimal;

public abstract class Territory {
  private String name;
  private double taxRatePercentage = 0;

  Territory(String name, double taxRatePercentage) {
    this.name = name;
    this.taxRatePercentage = taxRatePercentage;
  }

  public String getName() {
    return name;
  }

  public double getTaxRatePercentage() {
    return taxRatePercentage;
  }
}

class County extends Territory {
  County(String name, double taxRatePercentage) {
    super(name, taxRatePercentage);
  }
}

class City extends Territory {
  City(String name, double taxRatePercentage) {
    super(name, taxRatePercentage);
  }
}

class SchoolDistrict extends Territory {
  SchoolDistrict(String name, double taxRatePercentage) {
    super(name, taxRatePercentage);
  }
}
