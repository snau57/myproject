package com.wu

//Kotlin的 main方法不需寄生在某個類別內部，可直接設在第一層(Top-level)
fun main(args: Array<String>) {  //快捷鍵 maina + Tab鍵。如不需接收執行時的參數，也可使用快捷鍵 main + Tab鍵，來省略小括號內的字串陣列
//    println("Hello Kotlin");  //直接呼叫Kotlin內建的 println()方法，Kotlin每行程式最後的分號(;)可省略
//    Human().hello()  //Kotlin呼叫類別不用new，可直接呼叫
    val h = Human()  //Kotlin使用 val(value不可再改變值)及 var(variable可改變值)來定義物件
        h.hello()
}

class Human {  //增加Kotlin的類別不用另存成檔案
    fun hello() {  //Kotlin的方法如無回傳值則用不用寫
        println("Hello kotlin")
    }
}