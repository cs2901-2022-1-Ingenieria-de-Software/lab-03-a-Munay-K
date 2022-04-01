package lab.demand;
import java.util.HashMap;

public class Tax {
	private HashMap<String, Double> countryTaxes = new HashMap<String, Double>();
	
	public Tax(HashMap<String, Double> list) {
	  countryTaxes = list;
	}

    public Double calculateTax(String country) {
	  return countryTaxes.getOrDefault(country, 0.0D);
    }

}
