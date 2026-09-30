package oop1;

public class MusicPlayerMain1 {
    public static void main(String[] args) {
        boolean isOn = false;
        int volume = 0;
        //플레이어 시작
        System.out.println("음악 플레이어를 시작합니다");
        isOn = true;
        //볼륨 증가
        volume++;
        System.out.println("음악플레이어 볼륨: " + volume);
        //볼륨증가
        volume++;
        System.out.println("음악플레이어 볼륨: " + volume);
        //볼륨 감소
        volume--;
        System.out.println("음악플레이어 볼륨: " + volume);
        //상태확인
        System.out.println("음악플레이어 상태 확인");
        if(isOn){
            System.out.println("음악 플레이어 On, 볼륨: " + volume  );
        } else{
            System.out.println("음악 플레이어 Off, 볼륨: " + volume  );
        }
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");


    }
}
