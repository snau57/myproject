package com.wu

//Kotlin的 main方法不需寄生在某個類別內部，可直接設在第一層(Top-level)
fun main(args: Array<String>) {  //快捷鍵 maina + Tab鍵。如不需接收執行時的參數，也可使用快捷鍵 main + Tab鍵，來省略小括號內的字串陣列
//    println("Hello Kotlin");  //直接呼叫Kotlin內建的 println()方法，Kotlin每行程式最後的分號(;)可省略
//    Human().hello()  //Kotlin呼叫類別不用new，可直接呼叫
    val h = Human()  //Kotlin使用 val(value不可再改變值)及 var(variable可改變值)來定義物件
        h.hello()

    //Kotlin沒有基本資料型態，只有類別(物件)的資料型態(首字大寫)
    //Kotlin的變數設定用 val(value，不可改變) 及 var(variable，可被改變)
    val age1 = 19;  //變數型態不用指定，可自動推斷
    val age2 : Int = 19;  //如要特別指定 val 名稱：型態 = 值
    var weight = 66.5;
    var name : String;
    name = "Hank";
}

class Human {  //增加Kotlin的類別不用另存成檔案
    fun hello() {  //Kotlin的方法如無回傳值則用不用寫
        println("Hello kotlin")
    }
}