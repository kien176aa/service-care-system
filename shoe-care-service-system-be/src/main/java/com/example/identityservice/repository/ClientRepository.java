package com.example.identityservice.repository;

import com.example.identityservice.entity.Client;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    @Query("select c from Client c where (:keyWord is null or lower(c.email) like %:keyWord% " +
            "   or lower(c.name) like %:keyWord% or lower(c.tel) like %:keyWord% " +
            "   or lower(c.address) like %:keyWord%) " +
            "and (:clientCategoryId is null or c.clientCategory.id = :clientCategoryId)")
    Page<Client> search(String keyWord, Long clientCategoryId, Pageable pageable);
}