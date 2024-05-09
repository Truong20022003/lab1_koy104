package com.example.lab1

// bài 1
fun main() {
    var a = 0.0
    var b = 0.0
    println("Nhập a:")
    var s = readLine()
    if (s != null) a = s.toDouble()
    println("Nhập b:")
    s = readLine()
    if (s != null) b = s.toDouble()
    if (a == 0.0 && b == 0.0) {
        println("Phương trình vô số nghiệm")
    } else if (a == 0.0 && b != 0.0) {
        println("Phương trình vô nghiệm")
    } else {
        val x = -b / a
        println("No x=" + x)
    }
    lab22()
    lab23()
    lab24()

}

//bài 2
fun lab22() {
    var month = 0
    println("Nhập tháng:")
    val s: String? = readLine()
    if (s != null) month = s.toInt()
    when (month) {
        1, 2, 3 -> println("Tháng " + month + " thuộc quý 1")
        4, 5, 6 -> println("Tháng " + month + " thuộc quý 2")
        7, 8, 9 -> println("Tháng " + month + " thuộc quý 3")
        10, 11, 12 -> println("Tháng " + month + " thuộc quý 4")
        else -> println("Tháng " + month + " không hợp lệ")
    }
}

//bài 3
fun lab23() {
    var year = 0
    var s: String?
    println("Chương trình kiểm tra năm nhuần:")
    do {
        println("Nhập 1 năm:")
        s = readLine()
        while (s == null || s.toInt() < 0) {
            println("Nhập sai năm, nhập lại:")
            s = readLine()
        }
        year = s.toInt()
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            println("Năm $year là năm nhuần")
        } else {
            println("Năm $year không phải là năm nhuần")
        }
        print("Tiếp không?(c/k):")
        s = readLine()
        if (s == "k")
            break;
    } while (true)
    println("Kết thúc chương trình")
}
fun lab24(){
    // khai báo và sử dụng kĩ thuật null safety
    var mssv : String? = null // có thêm ? là cho phép trả về null
    var tenSv : String?

    println("Nhập mssv:")
    var s = readLine()
    if (s != null) mssv = s.toString()
    tenSv = getTenSv(mssv!!)
    println("tên sinh viên với mã $mssv là: $tenSv")
}
val danhSachSv : Map<String,String> = mutableMapOf("PH41980" to "Tran Quang Truong", "Ph11232" to "hehe")
fun getTenSv(mssv : String) : String? {
    val tenSv = danhSachSv.get(mssv)
    return tenSv
}