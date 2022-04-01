package lab.demand;

import java.util.List;
import lab.demand.Tax;

public class ManageDemand {

    private Tax m_tax;

    public ManageDemand(Tax tax) {
        this.m_tax = tax;
    }

    public double calculateTotal(List<Order> orders){
        // Calculate Taxes
        double taxes = 0.0;
        for (Order order : orders) {
            taxes += m_tax.calculateTax(order.country);
        }

        // Calculate Total
        double quantities = 0.0;
        for (Order order : orders) {
            double temp = order.quantity;
            quantities += temp;
        }

        return quantities * taxes;
    }

    public double calculateTotal(List<Order> orders, Tax tax){
        // Calculate additionals by country
        double taxes = 0.0;
        for (Order order : orders) {
            double m_tax = tax.calculateTax(order.country);
            taxes += tax;
        }

        // Calculate Total
        double quantities = 0.0;
        for (Order order : orders) {
            double temp = order.quantity;
            quantities += temp;
        }

        return quantities * taxes;
    }

}
