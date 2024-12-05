package com.zhuzi.dbshardingjdbc.repository;

import com.zhuzi.dbshardingjdbc.model.OrderInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderInfoRepository extends JpaRepository<OrderInfo, Long> {
}
