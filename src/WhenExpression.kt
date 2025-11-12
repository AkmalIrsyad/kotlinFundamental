fun main() {

    val nilai = "A"

//    alternatif selain memakai if
    when(nilai){
        "A" ->{
            println("Amazing")
        }
        "B" ->{
            println("Good")
        }
        "C" ->{
            println("Not bad")
        }
        "D" ->{
            println("Bad")
        }
        "E" ->{
            println("Try Again Year")
        } else -> {
            println("Ngulang")
        }
    }

    when(nilai){
        "A"-> println("Great")
        "B" -> println("Good Job")
        "C" -> println("Nt mas")
        else -> println("Kapan2 dah")
    }

    // When Expression Multiple Option
    when (nilai){
        "A","B","C" -> {
            println("Pass")
        }
        else -> {
            println("Not Pass")
        }
    }

    val nilaiLulus: Array<String> = arrayOf("A","B","C")
    when(nilai){
        in nilaiLulus -> println("Selamat Anda Lulus")
        !in nilaiLulus -> println("Maaf Tidak Lulus")
    }

//    When Expression Is
    val name = "agung"
    when(name){
        is String -> println("name Is String")
        !is String -> println("name is not String")
    }

    val nilaiNgaji = 91
    when{
        nilaiNgaji > 90 -> println("Amazing")
        nilaiNgaji > 80 -> println("Good Job")
        nilaiNgaji > 60 -> println("Not bad")
        else -> println("Ngulang Tahun Depan")
    }
}