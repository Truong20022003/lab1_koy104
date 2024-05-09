package com.example.lab1

class sinhVienModel (var  tenSv : String, var mssv : String, var diemTB : Float) {
  var daTotnghiep : Boolean? = null
    var tuoi : Int?= null


    constructor(  tenSv : String,  mssv : String,  diemTB : Float, daTotNghiep : Boolean?, tuoi : Int?) : this (tenSv, mssv,diemTB){
        this.daTotnghiep = daTotnghiep;
        this.tuoi = tuoi

    }
    fun getThongTin() : String {
        var sTotNghiep : String
        if (daTotnghiep == null){
            sTotNghiep = "chưa có thông tin"
        }else{
            if (daTotnghiep!!){
                sTotNghiep = "đã tốt nghiệp"
            }else{
                sTotNghiep = "chưa tốt nghiệp"
            }
        }
        var sTuoi : String
        if (tuoi == null){
            sTuoi = "Chưa có dữ liệu"
        }else{
            sTuoi = tuoi.toString()
        }
        return "Ten : $tenSv \n mssv: $mssv \n diemtb: $diemTB \n da tot nghiep: $sTotNghiep \n tuoi: $sTuoi \n"
    }
}