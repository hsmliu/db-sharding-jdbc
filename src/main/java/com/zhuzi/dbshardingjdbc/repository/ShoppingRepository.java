package com.zhuzi.dbshardingjdbc.repository;

import com.zhuzi.dbshardingjdbc.model.Shopping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingRepository extends JpaRepository<Shopping, Long> {
}