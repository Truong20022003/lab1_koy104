package com.example.lab1.buoi3.bai8

import java.time.LocalDate

fun main() {
    val quanLyTheMuon = QuanLyTheMuon()


    val sinhVien1 = SinhVien("Nguyễn Văn A", 20, "K63")
    val theMuon1 = TheMuon("PM001", LocalDate.now(), LocalDate.now().plusDays(7), "SH001", sinhVien1)
    quanLyTheMuon.themTheMuon(theMuon1)

    val sinhVien2 = SinhVien("Trần Thị B", 21, "K64")
    val theMuon2 = TheMuon("PM002", LocalDate.now(), LocalDate.now().plusDays(7), "SH002", sinhVien2)
    quanLyTheMuon.themTheMuon(theMuon2)

    println("Danh sách phiếu mượn:")
    quanLyTheMuon.hienThiDanhSachTheMuon()

    quanLyTheMuon.xoaTheMuon("PM002")

    println("\nDanh sách phiếu mượn sau khi xoá:")
    quanLyTheMuon.hienThiDanhSachTheMuon()
}