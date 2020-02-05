@file:Suppress("DEPRECATION")

package ru.skillbranch.dev_intensive_2019.extensions

import ru.skillbranch.dev_intensive_2019.models.User
import ru.skillbranch.dev_intensive_2019.models.UserView
import ru.skillbranch.dev_intensive_2019.utils.Utils
import java.util.*

fun User.toUserView() : UserView {

    val nickName = Utils.transliteration("$firstName $lastName")
    val initials = Utils.toInitials(firstName, lastName)
    val status = if (lastVisit == null) "Еще ни разу небыл." else if (isOnline) "online" else "Послений раз был ${lastVisit.humanizeDiff()}"

    return UserView(
        id,
        fullName = "$firstName $lastName",
        nickName = nickName,
        initials = initials,
        avatar = avatar,
        status = status
    )
}


