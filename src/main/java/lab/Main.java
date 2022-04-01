package lab;

import lab.demand.ManageDemand;
import lab.demand.Tax;
import lab.demand.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class Main {

    public static void main (String [ ] args) {
        System.out.println("===INICIO====");

		HashMap<String, Double> countryTaxes = new HashMap<String, Double>();
		countryTaxes.put("PE", 0.18D);
		countryTaxes.put("BR", 0.12D);

        Tax tax = new Tax(countryTaxes);
        ManageDemand mg = new ManageDemand(tax);

        List<Order> testOrders = buildSampleOrders();
        
        double resultFirst = mg.calculateTotal(testOrders);
        System.out.println(String.format("RESULTADO TOTAL 1 => %s", resultFirst));

		HashMap<String, Double> countryTaxes2 = new HashMap<String, Double>();
		countryTaxes.put("CO", 0.10D);
		countryTaxes.put("PE", 0.20D);
		countryTaxes.put("BR", 0.30D);

        Tax tax2 = new Tax(countryTaxes);
        double resultSecond = mg.calculateTotal(testOrders, tax2);
        System.out.println(String.format("RESULTADO TOTAL 2 => %s", resultSecond));
    }

    private static List<Order> buildSampleOrders() {
        List<Order> testOrders = new ArrayList<Order>();
        testOrders.add(new Order("PE", 10L));
        testOrders.add(new Order("PE", 20L));
        testOrders.add(new Order("CO", 10L));
        testOrders.add(new Order("BR", 10L));
        return testOrders;
    }

}
