package com.example.lab1



fun main(){
    print("Nguyễn Văn Anh - PS123456\n")
    print("=========================\n")
    println("Quanh năm buôn bán ở mom sông")
    println("Nuôi đủ năm con với một chồng")
    println("\tlặn lội thân cờ khi quãng vắng")
    println("\teo sèo mặt nước buổi đò đồng")
    println("Một duyên hai nợ âu đành phận")
    println("Năm nắng mười mưa há chẳng công")
    println("\tCha mẹ thói đời \"ăn ở bạc\"")
    println("\tCó chồng hờ hững cũng như không")
    println("\tCó chồng hờ hững cũng như không")
    println("\n bai 2")
    var a = 0.0
    var b = 0.0
    println("Nhập a:")
    var s = readLine()
    if (s != null) a = s.toDouble()
    println("Nhập b:")
    s = readLine()
    if (s != null) b = s.toDouble()
    println("Tổng: " + (a + b))
    println("Hiệu: " + (a - b))
    println("Tích: " + (a * b))
    println("Thương: " + (a / b))

    //filter
    val numbers = listOf(1, -2, 3, -4, 5, -6)      // 1

    val positives = numbers.filter { x -> x > 0 }  // 2

    val negatives = numbers.filter { it < 0 }      // 3

    ///map
    val numbers2 = listOf(1, -2, 3, -4, 5, -6)     // 1

    val doubled = numbers2.map { x -> x * 2 }      // 2

    val tripled = numbers2.map { it * 3 }          // 3
    ///all
    val numbers3 = listOf(1, -2, 3, -4, 5, -6)            // 1

    val allEven = numbers3.all { it % 2 == 0 }            // 2

    val allLess6 = numbers3.all { it < 6 }                // 3
    //none
    val numbers4 = listOf(1, -2, 3, -4, 5, -6)            // 1

    val allEven2 = numbers4.none { it % 2 == 1 }           // 2

    val allLess62 = numbers4.none { it > 6 }               // 3

        //first or null last or null
    val words = listOf("foo", "bar", "baz", "faz")         // 1
    val empty = emptyList<String>()                        // 2

    val first = empty.firstOrNull()                        // 3
    val last = empty.lastOrNull()                          // 4

    val firstF = words.firstOrNull { it.startsWith('f') }  // 5
    val firstZ = words.firstOrNull { it.startsWith('z') }  // 6
    val lastF = words.lastOrNull { it.endsWith('f') }      // 7
    val lastZ = words.lastOrNull { it.endsWith('z') }      // 8

    //count
    val numbers5 = listOf(1, -2, 3, -4, 5, -6)            // 1

    val totalCount = numbers5.count()                     // 2
    val evenCount = numbers5.count { it % 2 == 0 }        // 3

    main2()
    main3()
    main4()
}

val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3)        // 1
val sudoers: List<Int> = systemUsers                              // 2

fun addSystemUser(newUser: Int) {                                 // 3
    systemUsers.add(newUser)
}

fun getSysSudoers(): List<Int> {                                  // 4
    return sudoers
}

fun main2() {
    addSystemUser(4)                                              // 5
    println("Tot sudoers: ${getSysSudoers().size}")               // 6
    getSysSudoers().forEach {                                     // 7
            i -> println("Some useful info on user $i")
    }
    // getSysSudoers().add(5) <- Error!                           // 8
}

val openIssues: MutableSet<String> = mutableSetOf("uniqueDescr1", "uniqueDescr2", "uniqueDescr3") // 1

fun addIssue(uniqueDesc: String): Boolean {
    return openIssues.add(uniqueDesc)                                                             // 2
}

fun getStatusLog(isAdded: Boolean): String {
    return if (isAdded) "registered correctly." else "marked as duplicate and rejected."          // 3
}

fun main3() {
    val aNewIssue: String = "uniqueDescr4"
    val anIssueAlreadyIn: String = "uniqueDescr2"

    println("Issue $aNewIssue ${getStatusLog(addIssue(aNewIssue))}")                              // 4
    println("Issue $anIssueAlreadyIn ${getStatusLog(addIssue(anIssueAlreadyIn))}")                // 5
}

const val POINTS_X_PASS: Int = 15
val EZPassAccounts: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 100)   // 1
val EZPassReport: Map<Int, Int> = EZPassAccounts                                        // 2

fun updatePointsCredit(accountId: Int) {
    if (EZPassAccounts.containsKey(accountId)) {                                        // 3
        println("Updating $accountId...")
        EZPassAccounts[accountId] = EZPassAccounts.getValue(accountId) + POINTS_X_PASS  // 4
    } else {
        println("Error: Trying to update a non-existing account (id: $accountId)")
    }
}

fun accountsReport() {
    println("EZ-Pass report:")
    EZPassReport.forEach {                                                              // 5
            k, v -> println("ID $k: credit $v")
    }
}

fun main4() {
    accountsReport()                                                                    // 6
    updatePointsCredit(1)                                                               // 7
    updatePointsCredit(1)
    updatePointsCredit(5)                                                               // 8
    accountsReport()                                                                    // 9
}
