package lab.demand;

import java.util.List;
import lab.demand.Tax;

public class ManageDemand {

    private Tax m_tax;

    public ManageDemand(Tax tax) {
        this.m_tax = tax;
    }

    public double calculateTotal(List<Order> orders){
        double orderTaxes;
		long orderQuantity;
		double result = 0.0;
        for (Order order : orders) {
            orderTaxes = m_tax.calculateTax(order.getCountry());
			orderQuantity = order.getQuantity();
			result += orderTaxes*orderQuantity;
        }

        return result;
    }

    public double calculateTotal(List<Order> orders, Tax tax){
        double orderTaxes;
		long orderQuantity;
		double result = 0.0;
        for (Order order : orders) {
            orderTaxes = tax.calculateTax(order.getCountry());
			orderQuantity = order.getQuantity();
			result += orderTaxes*orderQuantity;
        }

        return result;
    }
}
