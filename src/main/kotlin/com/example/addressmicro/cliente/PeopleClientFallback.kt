package com.example.addressmicro.cliente

import com.example.addressmicro.cliente.dto.PeopleResponseDTO
import com.example.addressmicro.exceptions.ApiNotFoundException
import com.example.addressmicro.exceptions.PeopleNotFoundException
import feign.FeignException
import org.springframework.cloud.openfeign.FallbackFactory
import org.springframework.stereotype.Component

@Component
class PeopleClientFallback : FallbackFactory<PeopleClient> {
    override fun create(cause: Throwable): PeopleClient {
        return object : PeopleClient {
            override fun getPeopleById(peopleId: Long): PeopleResponseDTO {
                if ((cause as FeignException).status() == 404) {
                    throw PeopleNotFoundException("user not found!")
                }
                throw ApiNotFoundException("api not found")
            }
        }
    }
}
