package tqs.project.laundryplatform.service;

import tqs.project.laundryplatform.model.Item;
import tqs.project.laundryplatform.model.Order;
import tqs.project.laundryplatform.model.OrderType;

import java.util.List;

public interface LaundryService {
    List<Order> getOrder(int userID);
    List<OrderType> getOrderType();
    List<Item> getOrderItems(int orderID);
    List<Item> getItemTypes();

    boolean makeOrder(List<Item> items);

}
