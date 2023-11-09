package com.work.Tecocloud.repository;

import com.work.Tecocloud.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository  extends CrudRepository<User,Long> {
    User findByUsername(String userName);
}
