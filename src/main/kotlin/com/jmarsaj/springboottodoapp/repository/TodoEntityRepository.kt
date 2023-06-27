package com.jmarsaj.springboottodoapp.repository;

import com.jmarsaj.springboottodoapp.model.TodoEntity
import org.springframework.data.jpa.repository.JpaRepository

// JpaRepository contains API for basic CRUD operations and also
// API for pagination and sorting
// It contains full API of CrudRepository and PagingAndSortingRepository
interface TodoEntityRepository : JpaRepository<TodoEntity, Long> {
}