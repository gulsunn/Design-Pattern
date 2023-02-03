package DesignPattern.BehavioralDP.MediatorDP.ChatRoom;

import java.util.HashMap;
import java.util.Map;

public class ChatRoomMediator {

    //Tüm katılımcıları bilmeli

     Map<String,Participant> registeredParticipiants= new HashMap<>();


    public void register(Participant participant) {
        if(!registeredParticipiants.containsValue(participant)){
            registeredParticipiants.put(participant.getName(),participant);
        }
        participant.chatRoomMediator=this;
    }



    @Override
    public String toString() {
        return "ChatRoomMediator{}";
    }

    public void dispatch(String from, String to, String message) {

    Participant participant=registeredParticipiants.get(to);

        if (participant != null)
        {
            participant.receiveMessage(from,message);
        }
    }
}
