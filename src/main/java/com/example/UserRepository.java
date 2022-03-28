package com.example;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.model.User;

public interface UserRepository extends PagingAndSortingRepository<User, String> {

}
