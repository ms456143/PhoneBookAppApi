package com.PhoneBooApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PhoneBooApi.model.ContactEntity;

public interface ContactRepository extends JpaRepository<ContactEntity, Integer>{

}
