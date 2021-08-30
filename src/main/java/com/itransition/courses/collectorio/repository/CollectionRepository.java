package com.itransition.courses.collectorio.repository;

import com.itransition.courses.collectorio.entity.Collection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface CollectionRepository extends JpaRepository<Collection, Long> {

    @Query("SELECT u FROM Collection u WHERE u.name = :name")
    Optional<Collection> findByName(@Param("name") String name);

}
