fun main() {

    var firstName: String = "Akmal"
    var lastName: String = "Irsyad"

    // ini kalau String nya lebih dari 2 baris
    var address: String = """
       >Jalan Subang Belom Jadi,
       >jalan sukatani
       >jalan brebes
    """.trimMargin(">")

    println(firstName)
    println(lastName)
    println(address)

    var fullName: String = "$firstName $lastName"
    var desc: String = "Nama Saya $fullName length = ${fullName.length}"
    println(desc)
}