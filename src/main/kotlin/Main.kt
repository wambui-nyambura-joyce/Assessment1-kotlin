fun main() {
    val result = fact("Nyambura","Weddings")
    println(result)
    var arr = intArrayOf(12,14,15,46,40)
    var results = arrayStats(arr)
    println("Smallest: ${results.first}, Largest: ${results.second}, Average: ${results.third}")

}
fun fact(nam:String,nam2:String):Char{
return when {
    nam.length > nam2.length -> nam[0]
    nam.length > nam2.length -> nam[0]
    else -> nam[0]
}

}
fun arrayStats(arr: IntArray):Triple<Int, Int,Double>{
    var smallest = arr.minOrNull() ?: 0
    var largest = arr.maxOrNull() ?: 0
    var average = arr.average()
    return Triple(smallest,largest,average)
}
