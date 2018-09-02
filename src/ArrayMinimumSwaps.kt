import java.util.*

// Complete the minimumSwaps function below.
fun minimumSwaps(arr: Array<Int>): Int {
    var swapCounter = 0
    for (counter in 0 until arr.size){
        val subArr = arr.copyOfRange(counter, arr.size)
        val idxOfMin = subArr.indexOf(subArr.min())
        if (idxOfMin + counter != counter){
            // swap : https://stackoverflow.com/questions/45377802/swap-function-in-kotlin
            val temp = arr[idxOfMin + counter]
            arr[idxOfMin + counter]  = arr[counter]
            arr[counter] = temp
//            println(arr.asList())
            swapCounter++
        }
    }

    return swapCounter
}



fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val res = minimumSwaps(arr)

    println(res)
}
