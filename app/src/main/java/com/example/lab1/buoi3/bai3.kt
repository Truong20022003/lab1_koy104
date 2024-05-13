package com.example.lab1.buoi3

fun main()
{
    val soA: Int? = 23
    val soB: Int? = 43
    val tong = tinhTong(soA!!, soB!!)
    val hieu = tinhHieu(soA!!,soB!!)
    println("Tong 2 so $soA + $soB: $tong")
    println("Hieu 2 so $soA - $soB: $hieu")
    println("Binh phuong so $soA: ${binhPhuong(soA)})")
    println("Thuong 2 so $soA / $soB: ${tinhThuong(soA.toFloat(),soB.toFloat()) ()}")
    val ten = "heheheh"
    println("In hoa: ${inHoa(ten)}")

}
val tinhTong : (Int,Int) -> Int = {soA: Int, soB: Int -> (soA + soB)}
val tinhHieu = {soA: Int, soB: Int -> (soA - soB)}
val binhPhuong : (Int) -> Int = {it * it}
val tinhThuong = {soA: Float, soB: Float ->{
    if (soB == 0f ){
        println("so chia phải khác 0")
    }else{
        val  c = soA/soB
        c
    }
//    (soA / soB)
    }
}
val  inHoa : (String) -> String = String::uppercase