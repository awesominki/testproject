package com.example.testproject.repository;

import com.example.testproject.entity.Article;
import org.springframework.data.repository.CrudRepository;

public interface Articlerepository extends CrudRepository<Article,Long> {
}
