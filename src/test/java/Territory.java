public abstract class Territory {
  private String name;
  double taxRatePercentage = 0;

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

public class County extends Territory {
  County(String name, double taxRatePercentage) {
    super(name, taxRatePercentage);
  }
}

public class City extends Territory {
  City(String name, double taxRatePercentage) {
    super(name, taxRatePercentage);
  }
}

public class SchoolDistrict extends Territory {
  SchoolDistrict(String name, double taxRatePercentage) {
    super(name, taxRatePercentage);
  }
}
