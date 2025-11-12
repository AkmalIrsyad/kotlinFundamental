fun main() {

    val nama : String = "Akmal"

    val  nilai = 90

//    kondisi percabangan (if Expression)
//    Else Expression
    if (nilai > 75){
        println("Good Job")
    }else{
        println("Try again, Silahkan Coba lagi")
    }

//    else if Expression

    if (nilai > 90){
        println("Good job $nama")
    }else if(nilai > 80){
        println("Great $nama")

    }else if(nilai > 70){
        println("Coba Lagi $nama")
    }else{
        println("Remed mas $nama")
    }
}