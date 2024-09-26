package com.health.healthsys;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository {

    @Query(value = "select * from USERINFO")
    public List<String> getUserList();
}
