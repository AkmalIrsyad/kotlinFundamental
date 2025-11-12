fun main() {

    // Byte hanya bisa menampung angka Max 127, lebih dari itu error
    var age: Byte = 127

    // ini adalah Floating point diakhiri dengan F
    var sample: Float = 10.10F

    // integer nya bisa membaca binary
    var binary : Int = 0b010101010101

    // fungsi UnderScore untuk mempermudah Tulisan
    var price : Long = 9_000_000_000L

    // conversion, Hati-Hati bisa overflow
    var priceInt: Int = price.toInt()

    // ini conversion yang tidak overflow
    var doubeBinary: Double = binary.toDouble()

    println(sample)
    println(age)
    println(binary)
    println(price)
    println(priceInt)
    println(doubeBinary)

}