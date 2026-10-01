package oop1.ex;

public class Account {
    int balance =0;

    void deposit(int amount){
        balance += amount;
        System.out.println(amount +"원 입금하였습니다 잔액 : " + balance);
    }
    void withdraw(int amount){
        if(amount > balance){
            System.out.println("잔액이 부족합니다 잔액 : " + balance);
        } else {
            balance -= amount;
            System.out.println(amount + "원 출금하였습니다 잔액 : " + balance);
        }
    }
    void status(){
        System.out.println("잔고 :" + balance);
    }
}
