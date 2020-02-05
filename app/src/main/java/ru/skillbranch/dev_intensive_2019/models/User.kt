package ru.skillbranch.dev_intensive_2019.models

import ru.skillbranch.dev_intensive_2019.utils.Utils
import java.util.*

/** Create by Ananaz174 28.01.2020 */

data class User(
    val id: String,
    var firstName: String?,
    var lastName: String?,
    var avatar: String?,
    var rating: Int = 0,
    var respect: Int = 0,
    val lastVisit: Date? = null,
    val isOnline: Boolean = false
) {

    constructor(id: String,firstName: String?,lastName: String?) : this(
        id = id,
        firstName = firstName,
        lastName = lastName,
        avatar = null)

    constructor(id: String) : this(
        id = id,
        firstName = "John",
        lastName = "Doe"
    )

    init {
        println("I`m Alive! \n" +
                "${if (lastName === "Doe") "This is $firstName $lastName" else "And his name is $firstName $lastName"} \n")
    }

    companion object Factory{
        private var lastId: Int = -1
        fun makeUser(fullName:String) : User{
            lastId++


            val (firstName, lastName) = Utils.parseFullName(fullName)
            return User(id = "$lastId", firstName = firstName, lastName = lastName)
        }
    }
}