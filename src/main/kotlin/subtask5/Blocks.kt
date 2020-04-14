package subtask5

import kotlin.reflect.KClass
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class Blocks {

    // TODO: Complete the following function
    fun getData(blockA: Array<Any>, blockB: KClass<*>): Any {
        when (blockB) {
            Int::class -> {
                var sum = 0
                for (i in blockA) {
                    if (i is Int) {
                        sum += i
                    }
                }
                return sum
            }

            String::class -> {
                var str = StringBuilder()
                for (i in blockA) {
                    if (i is String) {
                        str.append(i)
                    }
                }
                return str.toString()
            }
            else -> {
                var data = LocalDate.now()
                var flag = true
                for (i in blockA) {
                    if (i is LocalDate) {
                        if ((flag) || (i > data)) {
                            flag = false
                            data = i
                        }
                    }
                }
                return data.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))
            }
        }
    }
}

