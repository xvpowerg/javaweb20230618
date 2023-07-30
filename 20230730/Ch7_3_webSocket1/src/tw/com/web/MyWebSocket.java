package tw.com.web;

import java.io.IOException;

import javax.websocket.OnMessage;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/echo")
public class MyWebSocket {
			
//		@OnMessage
//		public String message(String msg) {
//			return "WebSocket:"+msg.toUpperCase();
//		}
	
	@OnMessage
	public void onMessage(String message,Session session) throws IOException, InterruptedException {
		session.getBasicRemote().sendText("����T��:"+message);
		for (int i = 1; i < 10;i++) {
			Thread.sleep(500);
			session.getBasicRemote().sendText("Send Msg"+i+"��");
		}
		session.getBasicRemote().sendText("�e���F!");
	}
}
