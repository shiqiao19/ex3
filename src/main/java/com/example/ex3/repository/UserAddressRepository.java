package com.example.ex3.repository;

import com.example.ex3.entity.UserAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface UserAddressRepository extends JpaRepository<UserAddress, Integer> {

    @Query("SELECT ua FROM UserAddress ua WHERE ua.user.name=:name AND ua.address.detail=:detail")
    UserAddress find(@Param("name") String name, @Param("detail") String detail);
}
