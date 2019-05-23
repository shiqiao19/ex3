package com.example.ex3.repository;

import com.example.ex3.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface UserRepository extends JpaRepository<User, Integer> {
    /**
     * 获取指定ID的用户
     *
     * @param id
     * @return
     */
    @Query("SELECT u FROM User u WHERE u.id=:id")
    User find(@Param("id") int id);
}
