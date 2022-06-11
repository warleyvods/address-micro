package com.example.addressmicro.repository

import com.example.addressmicro.models.Address
import org.springframework.data.jpa.repository.JpaRepository

interface AddressRepository : JpaRepository<Address, Long> {

    fun findByPeopleId(id: Long): List<Address>

}
