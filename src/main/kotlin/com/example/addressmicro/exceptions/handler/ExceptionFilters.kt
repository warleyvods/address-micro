package com.example.addressmicro.exceptions.handler

import java.time.LocalDateTime

class ExceptionFilters(
    val title: String?,
    val status: Int?,
    val details: String?,
    val timestamp: LocalDateTime?,
    val devMsg: String?
) {

    data class Builder(
        var title: String? = null,
        var status: Int? = null,
        var details: String? = null,
        var timestamp: LocalDateTime? = null,
        var devMsg: String? = null
    ) {
        fun title(title: String) = apply { this.title = title }
        fun status(status: Int) = apply { this.status = status }
        fun details(details: String) = apply { this.details = details }
        fun timestamp(timestamp: LocalDateTime) = apply { this.timestamp = timestamp }
        fun devMsg(devMsg: String) = apply { this.devMsg = devMsg }
        fun build() = ExceptionFilters(title, status, details, timestamp, devMsg)
    }
}
