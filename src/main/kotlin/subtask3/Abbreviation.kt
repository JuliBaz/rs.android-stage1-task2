package subtask3

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        var aUpp = StringBuilder(a.toUpperCase())
        var i=0
        while (i!=b.length && aUpp.length>=b.length){
            if (aUpp[i]!=b[i]){
                aUpp.deleteCharAt(i)
                i--
            }
            ++i
        }
        if (i==b.length) return "YES"
        else return "NO"
    }
}
