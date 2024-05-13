package com.example.lab1.buoi3.bai7

open class Nguoi(val hoTen: String, val tuoi: Int, val queQuan: String, val maSoGV: String) {
    override fun toString(): String {
        return "Họ tên: $hoTen, Tuổi: $tuoi, Quê quán: $queQuan, Mã số giáo viên: $maSoGV"
    }
}

class CBGV(hoTen: String, tuoi: Int, queQuan: String, maSoGV: String,
           val luongCung: Float, val luongThuong: Float, val tienPhat: Float) : Nguoi(hoTen, tuoi, queQuan, maSoGV) {

    var luongThucLinh: Float = 0.0f

    init {
        tinhLuongThucLinh()
    }

    fun tinhLuongThucLinh() {
        luongThucLinh = luongCung + luongThuong - tienPhat
    }

    override fun toString(): String {
        return super.toString() + ", Lương thực lĩnh: $luongThucLinh"
    }
}

class QuanLyCBGV {
    private val danhSachCBGV = mutableListOf<CBGV>()

    fun themCBGV(hoTen: String, tuoi: Int, queQuan: String, maSoGV: String,
                 luongCung: Float, luongThuong: Float, tienPhat: Float) {
        val cbgv = CBGV(hoTen, tuoi, queQuan, maSoGV, luongCung, luongThuong, tienPhat)
        danhSachCBGV.add(cbgv)
    }

    fun xoaCBGV(maSoGV: String) {
        val cbgv = danhSachCBGV.find { it.maSoGV == maSoGV }
        if (cbgv != null) {
            danhSachCBGV.remove(cbgv)
            println("Đã xoá cán bộ giáo viên có mã số $maSoGV.")
        } else {
            println("Không tìm thấy cán bộ giáo viên có mã số $maSoGV để xoá.")
        }
    }

    fun inDanhSachCBGV() {
        danhSachCBGV.forEach { println(it) }
    }
}