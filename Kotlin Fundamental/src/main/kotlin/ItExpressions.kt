fun main(){
    val target = 10
    val terjual = 7
    val penjualan : String
    penjualan = if (terjual >7){
        "Kamu Mendapat Untung hari ini,Congrats!!"
    }else if (terjual < target){
        "Kamu hari ini Rugi, harus lebih semangat ya:)"
    }else{
        "penjualan mu hari ini tidak untung,tidak juga rugi"
    }
    print(penjualan)
}