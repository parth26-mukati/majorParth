package com.sheryians.major.repository;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;

import com.sheryians.major.model.Category;
import com.sheryians.major.model.Product;

public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
