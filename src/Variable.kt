//  variable constant (biasanya bisa diakses untuk keperluan global biasanya juga pakai UPPERCASE)
const val APPLICATION = "Aplikasi Belajar Kotlin"
const val  VERSION = "0.0.1"

fun main() {

// Variable Immutable (Tidak bisa di ubah tipe datanya, isinya bisa)
    val firstName = "Akmal"
    val age = 21

    val desc : String = "$firstName $age"
    val descFinal: String = "Variable $desc menggunakan Immutable dan length = ${desc.length}"
    println(descFinal)
// Variable Mutable

    var fullName = "Akmal Irsyad"
    fullName = "Dwi Yulianto"

    println("variable $fullName Menggunakan Variable Mutable dengan Panjang ${fullName.length}")

//   Nullable (Dikotlin tidak disarankan)
    val example: String? = null
    println(example)
    println("ini adalah variable $example dengan panjang ${example?.length}")

//   Nullable var
    var null2 : String? = null
    null2 = "joji"

    println("Variable ini awal null terus di ganti jadi variable berisi $null2 dengan panjang ${null2.length}")

    println("$APPLICATION : $VERSION")
}

