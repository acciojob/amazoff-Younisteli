package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliveryPartnerService {
    @Autowired
    OrderRepository orderRepository;
    public  void addPartner(String id){
        orderRepository.addPartner(id);
    }
    public DeliveryPartner getPartnerBYId(String id){
        return  orderRepository.getPartnerById(id);
    }
}

