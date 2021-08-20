package com.polestarhc.self0813;

public interface Bank {

    // 상수 (최대 고객에게 인출해 줄수 있는 금액 명시)
    public int MAX_INTEGER = 10000000;

    // 추상메소드 (인출하는 메소드)
    void withDraw(int price);

    // 추상메소드 (입금하는 메소드)
}


