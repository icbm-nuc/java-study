package oop1;

public class MusicPlayerMain3 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();
        //플레이어 시작
        on(data);
        //볼륨 증가
        up(data);
        //볼륨증가
        up(data);
        //볼륨 감소
        down(data);
        //상태확인
        off(data);

    }
    static void on(MusicPlayerData data){
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다");
    }
    static void off(MusicPlayerData data){
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다");
    }
    static void up(MusicPlayerData data){
        data. volume++;
        System.out.println("음악플레이어 볼륨: " + data.volume);
    }
    static void down(MusicPlayerData data){
        data.volume--;
        System.out.println("음악플레이어 볼륨: " + data.volume);
    }
    static void showStatus(MusicPlayerData data){
        System.out.println("음악플레이어 상태 확인");
        if(data.isOn){
            System.out.println("음악 플레이어 On, 볼륨: " + data.volume  );
        } else{
            System.out.println("음악 플레이어 Off, 볼륨: " + data.volume  );
        }
    }


}
