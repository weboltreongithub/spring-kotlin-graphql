package com.demoGraphql.demo

data class Person(val id: Int, val name: String) {
    var books: ArrayList<Book> = ArrayList()
}
