package ru.skillbranch.dev_intensive_2019.utils



object Utils {
    fun parseFullName(fullName: String?): Pair<String?, String?>{
        // TODO FIX ME!!!
        val parts : List<String>? = fullName?.split(" ")

        val firstName = parts?.getOrNull(0)
        val lastName = parts?.getOrNull(1)
        return firstName to lastName
    }

    fun transliteration(payload: String): String {
        val f = arrayOf(
            "А", "Б", "В", "Г", "Д", "Е", "Ё", "Ж", "З", "И", "Й", "К", "Л", "М", "Н", "О", "П",
            "Р", "С", "Т", "У", "Ф", "Х", "Ч", "Ц", "Ш", "Щ", "Э", "Ю", "Я", "Ы", "Ъ", "Ь", "а",
            "б", "в", "г", "д", "е", "ё", "ж", "з", "и", "й", "к", "л", "м", "н", "о", "п", "р",
            "с", "т", "у", "ф", "х", "ч", "ц", "ш", "щ", "э", "ю", "я", "ы", "ъ", "ь"
        )
        val t = arrayOf(
            "A", "B", "V", "G", "D", "E", "Jo", "Zh", "Z", "I", "J", "K", "L", "M", "N", "O", "P",
            "R", "S", "T", "U", "F", "H", "Ch", "C", "Sh", "Csh", "E", "Ju", "Ja", "Y", "`", "'",
            "a", "b", "v", "g", "d", "e", "jo", "zh", "z", "i", "j", "k", "l", "m", "n", "o", "p",
            "r", "s", "t", "u", "f", "h", "ch", "c", "sh", "csh", "e", "ju", "ja", "y", "`", "'"
        )

        var res: String? = ""

        for (i in payload.indices) {
            var add: String = payload.substring(i, i + 1)
            for (j in f.indices) {
                if (f[j] == add) {
                    add = t[j]
                    break
                }
            }
            res += add
        }

        return res!!

    }

    fun toInitials(firstName: String?, lastName: String?): String? {
        return (lastName?.get(0) ?: Char).toString() + (firstName?.get(0) ?: Char).toString()
    }
}