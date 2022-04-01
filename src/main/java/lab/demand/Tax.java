package lab.demand;
import java.util.HashMap;

public class Tax {
	private HashMap<String, Double> countryTaxes = new HashMap<String, Double>();
	
	public Tax(HashMap<String, Double> list) {
	  countryTaxes = list;
	}

    public double calculateTax(String country) {
	  countryTaxes.get(country);
	  if (countryTaxes.get(country) == null)
		return countryTaxes.get(country);
	  else
		return 0.0;
    }

}
