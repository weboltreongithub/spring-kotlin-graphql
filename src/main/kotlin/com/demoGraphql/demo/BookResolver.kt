package com.demoGraphql.demo

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.springframework.stereotype.Component

@Component
class BookResolver() : GraphQLQueryResolver {
    fun books(): List<Book> = listOf(Book1(), Book2(), Book3())

    companion object {
        fun Book1() = Book(1, "Isola del tesoro")
        fun Book2() = Book(2, "The 4-hour work week")
        fun Book3() = Book(3, "I Miserabili")
    }
}
