package lab.demand;

public class Order {

    private String country;
    private Long quantity;
    
    public Order(String country, Long quantity) {
        this.country = country;
        this.quantity = quantity;
    }

    public Long getQuantity() {
        return quantity;
    }
    public String getCountry() {
        return country;
    }

}
