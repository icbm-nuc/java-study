package extends2.ex;

import java.util.Scanner;

public class MonthSchedule {
    private int data;
    private Day[] days;

    public MonthSchedule(int data) {
        this.data = data;
        days = new Day[data];
        for (int i = 0; i < days.length; i++) {
            days[i] = new Day();
        }
    }

    //할일 적기
    public void input(String todo,int today){
        days[today].set(todo);
    }

    //보기
    public void view(int today){
        System.out.print(today+1 + "일의 할 일은");
        days[today].show();
    }

    public void run(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("이번달 스케쥴 관리 프로그램");
            System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
            int todo = scanner.nextInt();
            scanner.nextLine(); // 개행제거
            int date;
            if(todo == 1){
            //할일 입력
                System.out.print("날짜(1~30)?");
                date=scanner.nextInt();
                scanner.nextLine();

                String whatToDo;
                System.out.println("할일(빈칸없이입력)?");
                whatToDo=scanner.nextLine();

                input(whatToDo,date-1);

            } else if(todo == 2){
                System.out.print("날짜(1~30)?");
                date=scanner.nextInt();

                view(date-1);
            }else {
                System.out.println("프로그램을 종료합니다.");
                break;
            }


        }
    }
}
