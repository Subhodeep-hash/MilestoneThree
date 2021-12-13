package com.example.RelationalDBAPI.Repository;

import com.example.RelationalDBAPI.DbModel.NetflixShow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowRepository extends JpaRepository<NetflixShow, Integer> {

}
