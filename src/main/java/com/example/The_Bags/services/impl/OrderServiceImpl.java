package com.example.The_Bags.services.impl;

import com.example.The_Bags.entity.AdminPage;
import com.example.The_Bags.entity.Order;
import com.example.The_Bags.entity.User;
import com.example.The_Bags.pojo.OrderPojo;
import com.example.The_Bags.repo.OrderRepo;
import com.example.The_Bags.services.AdminPageService;
import com.example.The_Bags.services.OrderService;
import com.example.The_Bags.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRepo orderRepo;
    private final UserService userService;
    private final AdminPageService adminPageService;

    @Override
    public void saveData(OrderPojo orderPojo) throws IOException {
        Order order = new Order();

        User user = userService.fetchById(orderPojo.getUser_id());
        AdminPage adminPage = adminPageService.fetchById(orderPojo.getAdminPage_id()).get();
        order.setAdminPage(adminPage);
        order.setUser(user);

        orderRepo.save(order);

    }

    @Override
    public List<Object> getOrderList(Integer user_id) {
        return orderRepo.getOrderListByUser(user_id);
    }

    @Override
    public Optional<Order> fetchAll(Integer id) {
        return orderRepo.findById(id);
    }

    @Override
    public void deleteById(Integer id) {
        orderRepo.deleteById(id);
    }


}