package com.example.lab1.buoi3.bai7

fun main() {
    val quanLy = QuanLyCBGV()
    var ten: String = ""
    var tuoi: Int = 0
    var queQuan : String = ""
    var ma : String = ""
    var luongCung : Float = 0.0f
    var luongThuong : Float = 0f
    var tienPhat : Float = 0f

    println("Nhập tên:")
    var s = readLine()
    if (s != null) ten = s.toString()

    println("Nhập tuoi:")
     s = readLine()
    if (s != null) tuoi = s.toInt()

    println("Nhập quê:")
     s = readLine()
    if (s != null) queQuan = s.toString()

    println("Nhập mã:")
    s = readLine()
    if (s != null) ma = s.toString()

    println("Nhập lương cứng:")
    s = readLine()
    if (s != null) luongCung = s.toFloat()

    println("Nhập lương thưởng:")
    s = readLine()
    if (s != null) luongThuong = s.toFloat()

    println("Nhập lương phạt:")
    s = readLine()
    if (s != null) tienPhat = s.toFloat()

    quanLy.themCBGV("Nguyễn Văn A", 35, "Hà Nội", "GV001", 5000000.0f, 1000000.0f, 200000.0f)
    quanLy.themCBGV("Trần Thị B", 40, "Hải Phòng", "GV002", 5500000.0f, 1200000.0f, 300000.0f)
    quanLy.themCBGV(ten,tuoi,queQuan,ma,luongCung!!,luongThuong!!,tienPhat!!);

    println("Danh sách cán bộ giáo viên:")
    quanLy.inDanhSachCBGV()

    quanLy.xoaCBGV("GV002")

    println("\nDanh sách cán bộ giáo viên sau khi xoá:")
    quanLy.inDanhSachCBGV()
}