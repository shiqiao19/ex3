package com.example.ex3.repository;

import com.example.ex3.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface AddressRepository extends JpaRepository<Address, Integer> {
    /**
     * 获取指定详细信息的全部地址
     * @param detail
     * @return
     */
    @Query("select a FROM Address a WHERE a.detail=:detail")
    List<Address> list(@Param("detail") String detail);
}
