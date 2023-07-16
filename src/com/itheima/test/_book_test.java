package com.itheima.test;

public class _book_test {
    public static void main(String[] args) {
        _book b1=null;
        b1=new _book();
        b1.b_Id=001;
        b1.b_Name="三国演义";
        b1.b_Price=88.88;

        _book b2=null;
        b2=new _book();
        b2.b_Id=002;
        b2.b_Name="西游记";
        b2.b_Price=99.99;

        _book b5=null;
        b5=new _book();
        b5.b_Id=003;
        b5.b_Name="富婆通讯录";
        b5.b_Price=9999.66;

        b1.show();
        b2.show();
        b5.show();

    }
}
