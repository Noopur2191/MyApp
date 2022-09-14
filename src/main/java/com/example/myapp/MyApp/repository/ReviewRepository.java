package com.example.myapp.MyApp.repository;

import com.example.myapp.MyApp.Model.Reviews;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends JpaRepository<Reviews,Long> {
}
