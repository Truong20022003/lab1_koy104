package com.example.lab1

fun main() {
    val listSv = mutableListOf<sinhVienModel>()
    val sv1 = sinhVienModel("Nguyen Van Long", "PH11341", 8f)

    val sv2 = sinhVienModel("Tran Tuan Anh", "PH12541", 9f)
    sv2.daTotnghiep = false
    sv2.tuoi = 22
    val sv3 = sinhVienModel("Tran Thu Phuong", "PH12533", 8.5f, false, 22)
    listSv.add(sv1)
    listSv.add(sv2)
    listSv.add(sv3)
    for (sinhvien in listSv) {
        println(sinhvien.getThongTin())
    }
    print("Muốn xóa hay thêm?(x/t):")
    var s = readLine()
    if (s == "t") {
        var mssv: String = ""   // có thêm ? là cho phép trả về null
        var tenSv: String = ""
        var diem : Float = 0.0f
        var tuoi : Int = 0
        var totNghiep : Boolean = true

        println("Nhập mssv:")
        s = readLine()
        if (s != null) mssv = s.toString()

        println("Nhập tên:")
        s = readLine()
        if (s != null) tenSv = s.toString()

        println("Nhập điểm:")
        s = readLine()
        if (s != null) diem = s.toFloat()

        println("Nhập tuổi:")
        s = readLine()
        if (s != null) tuoi = s.toInt()

        println("Trạng thái:")
        s = readLine()
        if (s != null) totNghiep = s.toBoolean()


        val  newSv = sinhVienModel(tenSv!!,mssv!!,diem!!,totNghiep,tuoi)
        listSv.add(newSv)
        for (sinhvien in listSv)
        {
            println(sinhvien.getThongTin())
        }
    } else {
        println("Nhập mssv cần xóa:")
        val mssv = readLine() ?: ""
        val iterator = listSv.iterator()
        var found = false
        while (iterator.hasNext()) {
            val sv = iterator.next()
            if (sv.mssv == mssv) {
                iterator.remove()
                found = true
                break
            }
        }
        if (!found) {
            println("Không tìm thấy sinh viên có mã số là $mssv")
        }
        for (sinhVien in listSv) {
            println(sinhVien.getThongTin())
        }
    }
//        var mssv: String? = null // có thêm ? là cho phép trả về null
//        println("Nhập mssv cần xóa:")
//        s = readLine()
//        if (s != null) mssv = s.toString()
//        if (mssv == null) {
//            print("mã không hợp lệ")
//        } else {
//            for (i in listSv.indices) { // lấy đc index
//                if (listSv.get(i).mssv == mssv){
//                    listSv.removeAt(i)
//                }
//                for (sinhvien in listSv)
//                {
//                    println(sinhvien.getThongTin())
//                }
//            }
//        }
//
    

}