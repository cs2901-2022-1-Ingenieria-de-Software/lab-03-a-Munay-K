package lab.demand;

public class Order {

    String m_country;
    Long m_quantity;
    
    public Order(String country, Long quantity) {
        this.m_country = country;
        this.m_quantity = quantity;
    }
}
