package com.itheima.test;

import com.itheima.domain.movie;

public class movie_test {
    public static void main(String[] args) {
        movie m1=new movie(1,"东八区的先生们","2022",2.1,"中国大陆","剧情 喜剧","夏睿","张翰 王晓晨");
        movie m2=new movie(2,"西八区的先生们","2022",2.1,"中国大陆","剧情 喜剧","夏睿","张翰 王晓晨");
        movie m3=new movie(3,"八嘎区的先生们","2022",2.1,"中国大陆","剧情 喜剧","夏睿","张翰 王晓晨");

        movie[] arr={m1,m2,m3};

        movieService ms=new movieService(arr);
        ms.start();
    }
}
