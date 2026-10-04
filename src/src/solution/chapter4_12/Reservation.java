package solution.chapter4_12;

import java.util.Scanner;

public class Reservation {
    SeatA a;
    SeatB b;
    SeatS s;

    public Reservation(){
        a = new SeatA();
        b = new SeatB();
        s = new SeatS();
    }

    public void run(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("명품콘서트홀 예약 시스템입니다.");



        while(true){
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
            int seatClass;
            int todo = scanner.nextInt();
            scanner.nextLine(); // 개행제거

            if(todo == 4){
                return;
            } else if (todo == 1) {

                System.out.print("좌석구분 S(1), A(2), B(3)>>");
                seatClass = scanner.nextInt();
//                System.out.println("seatClass 값:" + seatClass);
                scanner.nextLine();//개행제거
                showSeat(seatClass);

                System.out.print("이름>>");
                String name = scanner.nextLine();

                System.out.print("번호>>");
                int seatNumber = scanner.nextInt();

                set(seatClass,name,seatNumber-1);

            } else if (todo == 2) {
                showSeat(1);
                showSeat(2);
                showSeat(3);
                System.out.println("<<<조회를 완료하였습니다.>>>");
            } else {
                System.out.print("좌석 S:1, A:2, B:3>>");
                seatClass = scanner.nextInt();
                scanner.nextLine();//개행제거
                showSeat(seatClass);

                System.out.print("이름>>");
                String name = scanner.nextLine();
                delete(seatClass, name);

            }


        }
    }

    private void delete(int seatClass, String name) {
        if(seatClass == 1){
            s.erase(name);
        } else if (seatClass == 2) {
            a.erase(name);
        } else {
            b.erase(name);
        }
    }

    private void set(int seatClass ,String name, int i) {

        if(seatClass == 1){
            s.set(name,i);
        } else if (seatClass == 2) {
            a.set(name,i);
        } else {
            b.set(name,i);
        }
    }

    private void showSeat(int seatClass) {
        switch (seatClass){
            case 1 :
                System.out.print("S>> ");
                s.show();
                break;

            case 2 :
                System.out.print("A>> ");
                a.show();
                break;

            case 3 :
                System.out.print("B>> ");
                b.show();
                break;

        }

    }
}
