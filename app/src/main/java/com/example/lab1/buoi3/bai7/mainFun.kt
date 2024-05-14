package com.example.lab1.buoi3.bai7

fun main() {

    println("------------------------")
    println("Menu quan ly GV")
    println("1. Them giao vien")
    println("2. Hien thi danh sach GV")
    println("3. Xoa GV")
    println("4. Cap nhat thong tin GV")
    println("5. Thoat chuong trinh")

    var tiepTuc: Boolean
    do {
        try {
            print("Nhap lua chon cua ban: ")
            val options: Int = readLine()!!.toInt()
            when (options) {
                1 -> {

                }


                2 -> {
                    println("Danh sach giao vien")
                    println("--------------------------")

                }

                3 -> {
                    println("Xoa giao vien")
                    println("--------------------------")
                    val quanLy = QuanLyCBGV()
                    var maGvXoa: String =""
                    println("Nhap ma gv can xoa")
                    var s = readLine()
                    maGvXoa = s.toString()
                    quanLy.xoaCBGV(maGvXoa)

                    println("\nDanh sách cán bộ giáo viên sau khi xoá:")
                    quanLy.inDanhSachCBGV()

                }

                4 -> {
                    println("Them thong tin gv")
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


                }

                5 -> {
                    println("Ket thuc chuong trinh")
                    tiepTuc = false
                }

                else -> {
                    println("Nhap sai, vui long nhap lai")
                }
            }
            println("Ban co muon chon tiep lua chon tren menu? (c/k) ")
            val s = readLine()
            tiepTuc = s == "c"
        } catch (e: Exception) {
            println("Nhap sai, vui long nhap lai")
            tiepTuc = true
        }

    } while (tiepTuc)



}