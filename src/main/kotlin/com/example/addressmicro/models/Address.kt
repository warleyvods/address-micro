package com.example.addressmicro.models

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Address(

    val street: String,
    val complement: String?,
    val number: String,
    val zipCode: String,
    val district: String,
    val state: String,
    val country: String,
    val city: String,
    val peopleId: Long

) {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0

}
