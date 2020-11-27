package com.wu;

//在IntelliJ 除了可使用VCS功能選單，也可按 Alt + 9 開啓版本控制視窗
//按 Alt + `(鍵盤左上同~鍵) 則可顯示常用版本控制(VC)動作

public class Hello {
    public static void main(String[] args) {  //Java程式的進入點，快捷鍵 psvm + Tab鍵
//        System.out.println("Hello world");  //快捷鍵 sout + Tab鍵
//        new Person().hello();  //用 new 生出Person物件，並使用其hello方法
        Person p = new Person();  //將 new 出的Person物件儲存於 p (Person物件)
        p.hello();  //呼叫 p (Person物件)身上的hello方法

        //Java的8種基本資料型態：
        int age = 19;  //32 bits 整數
        short num1 = 57;  //16 bits 整數
        long num2 = 1919;  //64 bits 整數
        byte num3 = 120;  //8 bits 整數
        char c = 'A';  //單一字元，也可儲存一個中文字
        float weight = 66.5f;  //Java會自動將有小數點數值設為double，所以需加上f告知為float
        double height = 1.7;
        boolean adult = true;  //布林值(true/false)
        //參照資料型態(屬於類別，所以首字大寫)，而且可使用功能(function)：
        String name = "Hank";  //字串(類別)
        //而上面的8種基本資料型態也都有相對應的類別(首字大寫)
        Integer age2 = 19;
        Character c2 = 'B';

    }
}
