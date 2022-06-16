package com.example.addressmicro.exceptions.handler

import com.example.addressmicro.exceptions.ApiNotFoundException
import com.example.addressmicro.exceptions.PeopleNotFoundException
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestControllerAdvice
import java.time.LocalDateTime

@RestControllerAdvice
class RestExceptionHandler {

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(PeopleNotFoundException::class)
    fun handleUserNotFound(ex: PeopleNotFoundException): ExceptionFilters {
        return ExceptionFilters.Builder()
            .timestamp(LocalDateTime.now())
            .details(ex.message!!)
            .devMsg(ex.javaClass.name)
            .status(HttpStatus.NOT_FOUND.value())
            .title("user not found!")
            .build()
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(ApiNotFoundException::class)
    fun handleApiNotFound(ex: ApiNotFoundException): ExceptionFilters {
        return ExceptionFilters.Builder()
            .timestamp(LocalDateTime.now())
            .details(ex.message!!)
            .devMsg(ex.javaClass.name)
            .status(HttpStatus.NOT_FOUND.value())
            .title("api people client not found!")
            .build()
    }
}
