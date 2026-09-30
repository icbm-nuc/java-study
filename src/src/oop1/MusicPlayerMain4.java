package oop1;

public class MusicPlayerMain4 {

    static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        //플레이어 시작
        player.on();
        //볼륨 증가
        player.up();
        //볼륨증가
        player.up();
        //볼륨 감소
        player.down();
        //상태확인
        player.showStatus();
        player.off();
    }
}
