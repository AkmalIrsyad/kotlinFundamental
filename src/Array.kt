fun main() {

    val names: Array<String> = arrayOf("Eko","Joko","Budi")

    names.set(0,"Rusdi")
    names[1] = "Gatot"
    println("saya ${names[0]} dan teman saya ${names[1]}")

    val nilai: Array<Int> = arrayOf(10,9,8)
    println(nilai[0])

//    Array Null
    val members: Array<String?> = arrayOfNulls(5)
    members[0] = "joko"
    members[1] = "joko"
    members[2] = "joko"
    members[3] = "joko"
    members[4] = "joko"
    members[5] = "joko" // ini gk bakal kebaca  "Index 5 out of bounds for length 5"
    println(members[5])
    println(members.size)
}