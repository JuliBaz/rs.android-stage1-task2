package subtask2

class TimeConverter {

    // TODO: Complete the following function
    fun toTextFormat(hour: String, minute: String): String {
        val Numbers = arrayOf(
            "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "quarter", "sixteen", "seventeen", "eighteen", "nineteen",
            "twenty", "twenty one", "twenty two", "twenty three", "twenty four", "twenty five", "twenty six",
            "twenty seven", "twenty eight", "twenty nine", "half"
        )
        val h = hour.toInt()
        val m = minute.toInt()
        var result = ""
        if (m == 0) result = Numbers[h]+" o' clock"
        else if (m in 1..14 || m in 16..29) result = Numbers[m]+" minutes past "+Numbers[h]
        else if (m == 15) result = "quarter past "+Numbers[h]
        else if (m == 30) result ="half past "+Numbers[h]
        else if (m == 45) result = "quarter to "+Numbers[h+1]
        else if (m in 31..44 || m in 46..59) result = Numbers[60 - m]+" minutes to "+ Numbers[(h % 12) + 1]

        return result
    }
}
