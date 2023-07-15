package com.jmarsaj.springboottodoapp.model

import java.time.LocalDateTime
import javax.persistence.*

// Entities are POJO's (plain old java object) representing data that can be persisted in the database
// An entity represents a table stored in a database
// Every instance of an entity represents a row in the table
@Entity
@Table(name = "todo_entity")
data class TodoEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    var id: Long? = null,

    @Column(name = "content")
    var content: String? = null,

    @Column(name = "completed")
    var completed: Boolean? = false,

    @Column(name = "created_datetime")
    var createdDatetime: LocalDateTime? = null,

    @Column(name = "completed_datetime")
    var completedDatetime: LocalDateTime? = null
)