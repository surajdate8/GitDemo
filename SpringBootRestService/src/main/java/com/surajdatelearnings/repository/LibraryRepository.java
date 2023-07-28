package com.surajdatelearnings.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.surajdatelearnings.controller.Library;

public interface LibraryRepository extends JpaRepository<Library, String> {

}
