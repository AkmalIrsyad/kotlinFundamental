fun main() {

    val range = 1..100

    // Range Operator
    println(range.count())
    println(range.contains(50))
    println(range.contains(200))
    println(range.first)
    println(range.last)
    println(range.step)
    println(range)

    // Range Terbalik

    val rangeTerbalik = 100 downTo 1

    println(rangeTerbalik.count())
    println(rangeTerbalik.contains(50))
    println(rangeTerbalik.contains(200))
    println(rangeTerbalik.first)
    println(rangeTerbalik.last)
    println(rangeTerbalik.step)
    println(rangeTerbalik)

    // Range Dengan Step
    val range1 = 0..1000 step 5
    val range2 = 1000 downTo 0 step 5

    println(rangeTerbalik.count())
    println(rangeTerbalik.contains(50))
    println(rangeTerbalik.contains(200))
    println(rangeTerbalik.first)
    println(rangeTerbalik.last)
    println(rangeTerbalik.step)
    println(rangeTerbalik)
}