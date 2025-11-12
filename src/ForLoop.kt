fun main() {

    var array = arrayOf("Akmal","Irsyad","Dwi","Yulianto","Rusdi")

    var total = 0
    for (name in array){
        println(name)
        total++
    }
    println("Total perulangan = $total")

//  For Range
    for (i in 0..100 step 2){
        println(i)
    }

    for (i in 100 downTo 0 step 2){
        println(i)
    }

    val ukuranArray = array.size - 1
    for (i in 0.. ukuranArray){
        println("Index $i = ${array.get(i)}")
    }
}