/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.vinovivo.websocket;

import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import ch.hearc.ig.vinovivo.utils.Services;

/**
 *
 * @author Morvan
 */
@ServerEndpoint(value = "/endpoint")
public class SocketEndPoint {

    private static final Set<Session> clients = Collections.synchronizedSet(new HashSet<Session>());

    @OnMessage
    public void message(String msg, Session session) throws IOException {
        //Si c'est on reçoit "init" d'un client
        if (msg.equals("init")) {
            String msgJson = Services.getVinstoJson();
            System.out.println(session);
            session.getBasicRemote().sendText(msgJson);
            /*synchronized (clients) {
            // Iterate over the connected sessions
                // and broadcast the received message
                for (Session client : clients) {
                    if (client.equals(session)) {
                        client.getBasicRemote().sendText(msgJson);
                    }
                }
            }*/
        }

    }
    @OnOpen
    public void onOpen(Session session) {
        clients.add(session);
        System.out.println("Client connecté"+clients.size());
    }

    @OnClose
    public void onClose(Session session) {
        clients.remove(session);
    }

    @OnError
    public void onError(Throwable t) {
    }

}
