package com.github.logof.collectorio.repository;

import com.github.logof.collectorio.entities.Category;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CategoryRepository extends CrudRepository<Category, Long> {

    @Query("select c from Category c where parentId is null")
    List<Category> getRootCategory();

    @Query("select c from Category c where parentId = ?1")
    List<Category> getSubCategory(Long id);
}
