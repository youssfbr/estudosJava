package estudos.poo;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.time.LocalDate;

public class EstudoEnumeracao {
    public static void main(String[] args) {

        Order order = new Order(1L, LocalDate.now(), OrderStatus.PENDING_PAYMENT);

        System.out.println();
        System.out.println(order);

        OrderStatus delivered = OrderStatus.DELIVERED;

        // Conversão de String to Enum
        OrderStatus delivered1 = OrderStatus.valueOf("DELIVERED");

        System.out.println();
        System.out.println(delivered);
        System.out.println(delivered1);
    }
}

enum OrderStatus {
    PENDING_PAYMENT,
    PROCESSING,
    SHIPPED,
    DELIVERED;
}

class Order {
    private Long id;
    private LocalDate moment;
    private OrderStatus status;

    public Order() {
    }

    public Order(Long id, LocalDate moment, OrderStatus status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getMoment() {
        return moment;
    }

    public void setMoment(LocalDate moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", moment=" + moment +
                ", status=" + status +
                '}';
    }
}
