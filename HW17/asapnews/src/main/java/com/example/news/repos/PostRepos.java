package com.example.news.repos;

import com.example.news.models.Posting;
import org.springframework.data.repository.CrudRepository;

public interface PostRepos extends CrudRepository<Posting, Long> {
}
