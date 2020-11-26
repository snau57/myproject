package com.wu;

public class Hello {
    public static void main(String[] args) {  //Java程式的進入點，快捷鍵 psvm + Tab鍵
//        System.out.println("Hello world");  //快捷鍵 sout + Tab鍵
//        new Person().hello();  //用 new 生出Person物件，並使用其hello方法
        Person p = new Person();  //將 new 出的Person物件儲存於 p (Person物件)
        p.hello();  //呼叫 p (Person物件)身上的hello方法
    }
}
