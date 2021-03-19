package com.demoGraphql.demo

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.springframework.stereotype.Component
import org.springframework.stereotype.Service

@Component
class PersonResolver() : GraphQLQueryResolver {
    fun persons(): List<Person> {

        val p1 = Person(1, "Giovanni Verga")
        p1.books.add(BookResolver.Book1())
        p1.books.add(BookResolver.Book3())

        val p2 =Person(2, "Eugenio Montale")
        p2.books.add(BookResolver.Book1())

        val p3 = Person(3, "Giuseppe Ungaretti")
        p3.books.add(BookResolver.Book2())
        p3.books.add(BookResolver.Book3())

        return listOf(p1,p2,p3)
    }

    fun searchPersons(term: String): List<Person> {
        return persons().filter { it.name.toLowerCase().indexOf(term.toLowerCase()) >= 0 }
    }
}
