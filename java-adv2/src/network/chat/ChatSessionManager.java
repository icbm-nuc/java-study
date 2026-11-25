package network.chat;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ChatSessionManager {

    // [변경] `final` 키워드 추가
    private final List<ChatSession> sessions = new ArrayList<>();

    public synchronized void add(ChatSession session) {
        sessions.add(session);
    }

    public synchronized void remove(ChatSession session) {
        sessions.remove(session);
    }

    // [삭제] 현재 미사용인 `getSessions()`, `closeAll()` 제거

    // [변경] `synchronized` 추가 (다른 스레드가 `add`/`remove`할 때 순회 충돌 방지)
    public synchronized void sendToAll(String message) {
        for (ChatSession session : sessions) {
            try {
                session.sendMessage(message);
            } catch (IOException e) {
                // 전송 실패 세션 무시
            }
        }
    }
}