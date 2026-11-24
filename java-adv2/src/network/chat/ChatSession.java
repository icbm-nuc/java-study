package network.chat;

import network.tcp.SocketCloseUtil;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import static network.tcp.SocketCloseUtil.*;
import static util.MyLogger.log;

public class ChatSession implements Runnable{

    private final Socket socket;
    private final DataInputStream input;
    private final DataOutputStream output;
    private final ChatSessionManager sessionManager;
    private boolean closed = false;


    public ChatSession(Socket socket, ChatSessionManager sessionManager) throws IOException {
        this.socket = socket;
        this.input = new DataInputStream(socket.getInputStream());
        this.output = new DataOutputStream(socket.getOutputStream());
        this.sessionManager = sessionManager;
        this.sessionManager.add(this);
    }

    @Override
    public void run() {

    }

    public void close() throws IOException {
        if (closed){
            return;
        }
        closeAll(socket,input,output);
        closed = true;
        log("연결 해제 : " + socket + " isClosed : " + socket.isClosed());
    }
}
