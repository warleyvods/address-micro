package com.example.addressmicro.controllers.mapper

import com.example.addressmicro.controllers.dtos.AddressRequestDTO
import com.example.addressmicro.controllers.dtos.AddressResponseDTO
import com.example.addressmicro.models.Address

class AddressMapper {
    companion object {
        fun toDomain(addressRequestDTO: AddressRequestDTO) = Address(
            addressRequestDTO.street,
            addressRequestDTO.complement,
            addressRequestDTO.number,
            addressRequestDTO.zipCode,
            addressRequestDTO.district,
            addressRequestDTO.state,
            addressRequestDTO.country,
            addressRequestDTO.city,
            addressRequestDTO.peopleId
        )

        fun fromDomain(address: Address) = AddressResponseDTO(
            address.id,
            address.street,
            address.complement,
            address.number,
            address.zipCode,
            address.district,
            address.state,
            address.country,
            address.city
        )

        fun fromDomainList(addressList: List<Address>) = addressList.map { fromDomain(it) }
    }
}
