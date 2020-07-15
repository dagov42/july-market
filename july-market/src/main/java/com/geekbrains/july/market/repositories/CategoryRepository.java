package com.geekbrains.july.market.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.geekbrains.july.market.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
    Category findOneByTitle(String title);
}
