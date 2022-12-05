package com.catalog.projectCatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.catalog.projectCatalog.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
