package com.example.The_Bags.repo;

import com.example.The_Bags.entity.AdminPage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminPageRepo extends JpaRepository<AdminPage,Integer> {
}
