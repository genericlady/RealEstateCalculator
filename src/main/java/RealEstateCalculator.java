public class RealEstateCalculator implements PercentageConversion {

  public double convertPercentToDecimal(double percent) {
    return percent * 0.01;
    // java> double decimal = 0.01 * totalPercent;
    // double decimal = 0.005490000000000001
    // TODO: implement a roundup calculation e.g. (double)Math.round(testPercent * 1000d) / 1000d;
  }

  public double totalTaxRate(County county, City city, SchoolDistrict schoolDistrict) {
    double totalPercent = county.getTaxRatePercentage() + city.getTaxRatePercentage() + schoolDistrict.getTaxRatePercentage();
    return convertPercentToDecimal(totalPercent);
  }

  public long totalRealEstateValue(long landValue, long improvementValue) {
    return landValue + improvementValue;
  }

  public double calculateTaxes(long totalRealEstateValue, double totalTaxRate) {
    return totalTaxRate * totalRealEstateValue ;
  }
}
