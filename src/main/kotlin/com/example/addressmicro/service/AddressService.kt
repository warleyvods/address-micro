package com.example.addressmicro.service

import com.example.addressmicro.cliente.PeopleClient
import com.example.addressmicro.models.Address
import com.example.addressmicro.repository.AddressRepository
import org.springframework.stereotype.Service

@Service
class AddressService(
    private val addressRepository: AddressRepository,
    private val peopleClient: PeopleClient
) {

    fun save(address: Address): Address {
        peopleClient.getPeopleById(address.peopleId).id
        return addressRepository.save(address)
    }

    fun findById(id: Long) = addressRepository.findById(id).get()


    fun listAll(id: Long) = addressRepository.findByPeopleId(id)

}
