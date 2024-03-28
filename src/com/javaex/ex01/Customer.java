package com.javaex.ex01;

public class Customer extends Person {

    private int cNo;
    private int point;

    public Customer() {
        super();
        System.out.println("생성자 Customer(0) 호출");
    }

    public Customer(String name, String hp, int cNo, int point) {
        super(name, hp);
        this.cNo = cNo;
        this.point = point;
        System.out.println("생성자 Customer(4) 호출");
    }

    public int getcNo() {
        return cNo;
    }

    public void setcNo(int cNo) {
        this.cNo = cNo;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public void showInfo() {
        System.out.printf("#이름:%s, #핸드폰:%s, #고객번호:%d, #포인트점수:%d\n"
                , super.getName(), super.getHp(), cNo, point);
    }
}
