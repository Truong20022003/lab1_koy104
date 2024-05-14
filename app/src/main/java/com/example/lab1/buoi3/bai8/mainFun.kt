package com.example.lab1.buoi3.bai8

import com.example.lab1.buoi3.bai7.QuanLyCBGV
import java.time.LocalDate

fun main() {

    val quanLyTheMuon = QuanLyTheMuon()




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
                        val sinhVien1 = SinhVien("Nguyễn Văn A", 20, "K63")
                        val theMuon1 = TheMuon("PM001", LocalDate.now(), LocalDate.now().plusDays(7), "SH001", sinhVien1)
                        quanLyTheMuon.themTheMuon(theMuon1)





                    }

                    3 -> {
                        quanLyTheMuon.xoaTheMuon("PM002")

                        println("\nDanh sách phiếu mượn sau khi xoá:")
                        quanLyTheMuon.hienThiDanhSachTheMuon()

                    }

                    4 -> {

                        val sinhVien2 = SinhVien("Trần Thị B", 21, "K64")
                        val theMuon2 = TheMuon("PM002", LocalDate.now(), LocalDate.now().plusDays(7), "SH002", sinhVien2)
                        quanLyTheMuon.themTheMuon(theMuon2)

                        println("Danh sách phiếu mượn:")
                        quanLyTheMuon.hienThiDanhSachTheMuon()

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



