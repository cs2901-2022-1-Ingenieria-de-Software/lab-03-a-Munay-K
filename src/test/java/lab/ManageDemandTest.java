package lab;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import lab.demand.ManageDemand;
import lab.demand.Tax;
import lab.util.TestUtil;
import lab.demand.Order;

import java.util.List;
import java.util.HashMap;

@Test
public class ManageDemandTest {

    private Tax tax;

    private ManageDemand demand;

    @BeforeClass
    public void setup() {
		HashMap<String, Double> countryTaxes = new HashMap<String, Double>();
		countryTaxes.put("PE", 0.18D);
		countryTaxes.put("BR", 0.12D);

        tax = new Tax(countryTaxes);
        demand =  new ManageDemand(tax);
    }
    
    public void test_AllOrdersFromPeru() {
        List<Order> ordersFromPeru = TestUtil.buildOrdersPeru();
        double result = demand.calculateTotal(ordersFromPeru);
        Assert.assertEquals(Math.round(result), 7.0);
    }

	public void test_AllOrdersColombia() {
        List<Order> ordersFromColombia = TestUtil.buildOrdersColombia();
        double result = demand.calculateTotal(ordersFromColombia);
        Assert.assertEquals(Math.round(result), 0.0);
	}

}
