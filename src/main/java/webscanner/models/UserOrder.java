package webscanner.models;

import javax.persistence.*;

@Table(name = "SBUserOrders")
@Entity
public class UserOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private int id;
    private String userId;
    private int orderId;
    private String type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
