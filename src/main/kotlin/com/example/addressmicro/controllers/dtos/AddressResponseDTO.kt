package com.example.addressmicro.controllers.dtos

data class AddressResponseDTO(
    val id: Long,
    val street: String,
    val complement: String?,
    val number: String,
    val zipCode: String,
    val district: String,
    val state: String,
    val country: String,
    val city: String
) {
}
