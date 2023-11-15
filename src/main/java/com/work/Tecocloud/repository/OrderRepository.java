package com.work.Tecocloud.repository;

import com.work.Tecocloud.models.TacoOrder;
import com.work.Tecocloud.models.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<TacoOrder, String> {
    List<TacoOrder> findByDeliveryZip(String deliveryZip);
    List<TacoOrder> findByUserOrderByPlacedAtDesc(User user);
}
