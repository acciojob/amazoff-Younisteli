package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class OrderService {
    @Autowired
    OrderRepository orderRepository;

    public void addOrder(Order order){

        orderRepository.addOrder(order);
    }
    public Order getOrder(String id){
        return orderRepository.getOrderById(id);
    }
    public void OrderPartnerPair(String orderId, String partnerId){
        orderRepository.addOrderPartnerPair(orderId, partnerId);
    }

    public int orderCountByPartnerId(String partnerId){
        return orderRepository.orderCountByPartnerId(partnerId);
    }

    public List<String> getOrdersByPartnerId(String partnerId) {
        return orderRepository.getOrdersByPartnerId(partnerId);
    }

    public List<String> getAllOrders() {
        return orderRepository.getAllOrders();
    }

    public Integer getCountOfUnassignedOrders() {
        return orderRepository.getCountOfUnassignedOrders();
    }

    public Integer getOrdersLeftAfterGivenTimeByPartnerId(String time, String partnerId) {
        return  orderRepository.getOrdersLeftAfterGivenTimeByPartnerId(time,partnerId);
    }

    public String getLastDeliveryTimeByPartnerId(String partnerId) {
        return orderRepository.getLastDeliveryTimeByPartnerId(partnerId);
    }

    public void deletePartnerById(String partnerId) {
        orderRepository.deletePartnerById(partnerId);
    }

    public void deleteOrderById(String orderId) {
        orderRepository.deleteOrderById(orderId);
    }
}
