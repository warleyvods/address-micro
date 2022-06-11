package com.example.addressmicro.controllers

import com.example.addressmicro.cliente.PeopleClient
import com.example.addressmicro.controllers.dtos.AddressRequestDTO
import com.example.addressmicro.controllers.dtos.AddressResponseDTO
import com.example.addressmicro.controllers.mapper.AddressMapper
import com.example.addressmicro.models.Address
import com.example.addressmicro.service.AddressService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
@RequestMapping("api/address")
class AddressController(private val addressService: AddressService) {

    @PostMapping
    fun save(@RequestBody @Valid addressRequestDTO: AddressRequestDTO): AddressResponseDTO {
        val address = AddressMapper.toDomain(addressRequestDTO)
        return AddressMapper.fromDomain(addressService.save(address))
    }

    @GetMapping("{id}")
    fun find(@PathVariable id: Long): AddressResponseDTO {
        return AddressMapper.fromDomain(addressService.findById(id))
    }

    @GetMapping("list/{id}")
    fun findAll(@PathVariable(value = "id") peopleId: Long): List<AddressResponseDTO> {
        return AddressMapper.fromDomainList(addressService.listAll(peopleId))
    }

}
