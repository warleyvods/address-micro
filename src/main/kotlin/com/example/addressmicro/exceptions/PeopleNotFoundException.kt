package com.example.addressmicro.exceptions

import java.lang.RuntimeException

class PeopleNotFoundException(msg: String?) : RuntimeException(msg)
