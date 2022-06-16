package com.example.addressmicro.controllers.dtos

data class AddressRequestDTO(
    val peopleId: Long,
    val street: String,
    val complement: String?,
    val number: String,
    val zipCode: String,
    val district: String,
    val state: String,
    val country: String,
    val city: String
)
