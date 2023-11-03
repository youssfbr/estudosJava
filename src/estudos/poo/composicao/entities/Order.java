package estudos.poo.composicao.entities;

import estudos.poo.composicao.entities.enums.OrderStatus;

import static estudos.poo.composicao.application.Main.formatterDateTime;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private final LocalDateTime moment;
    private OrderStatus status;
    private Client client;
    private final List<OrderItem> items = new ArrayList<>();

    public Order(LocalDateTime moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }
    public void removeItem(OrderItem item) {
        items.remove(item);
    }
    public double total() {
        return items.stream()
                .mapToDouble(OrderItem::subTotal)
                .sum();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(moment.format(formatterDateTime)).append("\n");
        sb.append("Order status: ");
        sb.append(getStatus()).append("\n");
        sb.append(client).append("\n");
        sb.append("Order items: ").append("\n");

        for (OrderItem item : items) {
            sb.append(item).append("\n");

        }

        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }
}
