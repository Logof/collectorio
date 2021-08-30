package com.itransition.courses.collectorio.repository;

import com.itransition.courses.collectorio.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface ItemRepository extends JpaRepository<Item, Long> {

    @Query("SELECT u FROM Item u WHERE u.name = :name")
    Optional<Item> findByName(@Param("name") String name);

}
