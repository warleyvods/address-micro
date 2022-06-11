package com.example.addressmicro.cliente

import com.example.addressmicro.cliente.dto.PeopleResponseDTO
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient(url = "\${microservice.people.url}", name = "peopleClient")
interface PeopleClient {

    @GetMapping("{id}")
    fun getPeopleById(@PathVariable(value = "id") peopleId: Long): PeopleResponseDTO

}
