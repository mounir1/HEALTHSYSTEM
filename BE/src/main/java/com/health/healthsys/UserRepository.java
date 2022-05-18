package com.health.healthsys;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {

    @Query(value = "select * from USER")
    public String getUser();
}
