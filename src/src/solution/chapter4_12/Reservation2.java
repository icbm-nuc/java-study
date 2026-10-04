package solution.chapter4_12;

import java.util.Scanner;

public class Reservation2 {
    // 3개 객체를 배열로 관리하면 switch/if-else 조건문을 제거할 수 있습니다.
    private Group[] groups = new Group[3];

    public Reservation2() {
        groups[0] = new Group("S");
        groups[1] = new Group("A");
        groups[2] = new Group("B");
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("명품콘서트홀 예약 시스템입니다.");

        while (true) {
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
            int todo = scanner.nextInt();
            scanner.nextLine();

            if (todo == 4) {
                return;
            } else if (todo == 1) {
                System.out.print("좌석구분 S(1), A(2), B(3)>>");
                int seatClass = scanner.nextInt();
                scanner.nextLine();

                groups[seatClass - 1].show(); // if-else 없이 한 줄로 처리 가능

                System.out.print("이름>>");
                String name = scanner.nextLine();

                System.out.print("번호>>");
                int seatNumber = scanner.nextInt();

                groups[seatClass - 1].set(name, seatNumber - 1);

            } else if (todo == 2) {
                for (Group group : groups) {
                    group.show();
                }
                System.out.println("<<<조회를 완료하였습니다.>>>");

            } else if (todo == 3) {
                System.out.print("좌석 S:1, A:2, B:3>>");
                int seatClass = scanner.nextInt();
                scanner.nextLine();

                groups[seatClass - 1].show();

                System.out.print("이름>>");
                String name = scanner.nextLine();
                groups[seatClass - 1].erase(name);
            }
        }
    }
}