package com.example

import grails.transaction.Transactional

@Transactional(readOnly = true)
class BookController {
    static scaffold = Book
}
