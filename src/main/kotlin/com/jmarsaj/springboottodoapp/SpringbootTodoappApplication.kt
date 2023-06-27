package com.jmarsaj.springboottodoapp

import com.jmarsaj.springboottodoapp.model.TodoEntity
import com.jmarsaj.springboottodoapp.repository.TodoEntityRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
// CommandLineRunner is a simple Spring Boot interface with a run method.
// Spring Boot will automatically call the run method of all beans implementing
// this interface after the application context has been loaded
class SpringbootTodoappApplication : CommandLineRunner {

	// we can inject other beans using @Autowired
	@Autowired
	// lateinit: declaring variables that are guaranteed to be initialized later
	lateinit var todoRepository: TodoEntityRepository

	override fun run(vararg args: String?) {
//		to create sample data here
//		right click application and select build module while running
//		val todo1 = TodoEntity().apply {
//			content="watch basketball"
//			completed=false
//		}
//
//		todoRepository.save(todo1)
//
//		val todo2 = TodoEntity().apply {
//			content="watch soccer"
//			completed=false
//		}
//
//		todoRepository.save(todo2)

	}
}

fun main(args: Array<String>) {
	runApplication<SpringbootTodoappApplication>(*args)
}
