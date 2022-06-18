package com.example.addressmicro.usecases

import com.example.addressmicro.models.Address
import com.example.addressmicro.service.AddressService
import org.springframework.stereotype.Component
import java.util.function.Consumer

@Component
class DeleteAddressUsecase(private val addressService: AddressService) {
    fun deleteIfExists(id: Long) {
        addressService.listAll(id).forEach(Consumer { address: Address? ->
            if (address != null) {
                addressService.deleteByid(
                    address.id
                )
            }
        })
    }
}
