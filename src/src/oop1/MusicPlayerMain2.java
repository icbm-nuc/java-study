package oop1;

public class MusicPlayerMain2 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        //플레이어 시작
        System.out.println("음악 플레이어를 시작합니다");
        data.isOn = true;
        //볼륨 증가
        data.volume++;
        System.out.println("음악플레이어 볼륨: " + data.volume);
        //볼륨증가
        data. volume++;
        System.out.println("음악플레이어 볼륨: " + data.volume);
        //볼륨 감소
        data.volume--;
        System.out.println("음악플레이어 볼륨: " + data.volume);
        //상태확인
        System.out.println("음악플레이어 상태 확인");
        if(data.isOn){
            System.out.println("음악 플레이어 On, 볼륨: " + data.volume  );
        } else{
            System.out.println("음악 플레이어 Off, 볼륨: " + data.volume  );
        }
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");

    }
}
