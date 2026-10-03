package extends2.ex;

import java.util.Scanner;

public class PhoneBook {
    private Phone[] phone;

    public PhoneBook(int count) {
        phone = new Phone[count];

        for (int i = 0; i < phone.length; i++) {
             phone[i] = new Phone();
        }
    }

    public void search(String name){
        boolean searchName = false;
        for (Phone ph : phone) {
//            System.out.println("search 반복");
             searchName = ph.getName().equals(name);

            if(searchName){
                String tel = ph.getTel();
                System.out.println(name + "의 번호는 " + tel +" 입니다.");
                return;
            }
        }
        System.out.println(name + " 이 없습니다.");
    }

    public void run(){
        Scanner scanner = new Scanner(System.in);

        for (Phone ph : phone) {
            String name, tel;

            System.out.print("이름과 전화번호(이름과번호는 빈 칸없이 입력)>>");

            name = scanner.next();
            tel = scanner.next();
            ph.set(name,tel);

        }
        System.out.println("저장되었습니다.");

        scanner.nextLine();

        while(true){
            System.out.print("검색할 이름>>");
            String searchName = scanner.nextLine();

            if(searchName.equals("그만")){
                break;
            }

            search(searchName);
//            System.out.println("run 내부 반복 ");
        }


    }
}
