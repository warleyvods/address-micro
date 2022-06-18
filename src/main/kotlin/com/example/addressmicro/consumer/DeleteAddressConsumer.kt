package com.example.addressmicro.consumer

import com.example.addressmicro.usecases.DeleteAddressUsecase
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class DeleteAddressConsumer(val deleteAddressUsecase: DeleteAddressUsecase) {

    @KafkaListener(topics = ["people-topic"], groupId = "group-id")
    fun listen(peopleId: String) {
        deleteAddressUsecase.deleteIfExists(peopleId.toLong())
    }
}
