package com.jmarsaj.springboottodoapp.repository;

import com.jmarsaj.springboottodoapp.model.TodoEntity
import org.springframework.data.jpa.repository.JpaRepository

interface TodoEntityRepository : JpaRepository<TodoEntity, Long> {
}