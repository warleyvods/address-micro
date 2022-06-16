package com.example.addressmicro.exceptions

import java.lang.RuntimeException

class ApiNotFoundException(msg: String?) : RuntimeException(msg)
