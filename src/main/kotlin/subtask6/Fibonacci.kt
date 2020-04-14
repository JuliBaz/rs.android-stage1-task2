package subtask6

class Fibonacci {

    // TODO: Complete the following function
    fun productFibonacciSequenceFor(n: Int): IntArray {
        var i=0
        var j=1
        while ((i*j)<n){
    var sum=i+j
            i=j
            j=sum
        }
     return intArrayOf(i,j,if((i*j)==n) 1 else 0)
    }
}
