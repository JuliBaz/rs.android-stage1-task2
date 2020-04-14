package subtask1

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.text.SimpleDateFormat
import java.util.*

class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
        return try {
            val data = GregorianCalendar()
            data.isLenient = false
            data.set(Calendar.DAY_OF_MONTH, day.toInt())
            data.set(Calendar.MONTH, month.toInt()-1)
            data.set(Calendar.YEAR, year.toInt())

            val specialDateFormat = SimpleDateFormat("d MMMM, EEEE", Locale("ru"))
            specialDateFormat.format(data.time)

        }
        catch (i: IllegalArgumentException){
            "Такого дня не существует" }
} }

