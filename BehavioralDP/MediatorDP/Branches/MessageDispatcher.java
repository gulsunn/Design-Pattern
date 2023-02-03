package DesignPattern.BehavioralDP.MediatorDP.Branches;

import java.util.HashMap;
import java.util.Map;

public class MessageDispatcher implements Dispatcher {  //Dispatcher actörleri ve topic lerini bilmeli
    Map<String, Actor> registeredActors = new HashMap<>(); //Siz bir danışmansanız tüm actorleri ve topiclerini bilmelisiniz bu iki bilgiyi tutmak içinde map kullandık  key: Topic ,value :Actor


    void register(String topic,Actor actor){  //Aktörleri bilmiyoruz kaydetmeliyiz bu metod ile

        registeredActors.put(topic,actor);
    }

    @Override
    public void dispatch(String topic, String message) {// Fizik ---> Yer çekimi kuvvet katsayısı
        Actor actor = registeredActors.get(topic);
        if(actor==null) {  // ilgili uzmanlıga ait Actor yoksa
            System.out.println("No actor registered for this topic");
        } else {
            actor.receiveMessage(message);// ilgili uzmanlıga ait actor ü bulduk o aktörün receiveMessage() almasını sağlıyoruz
        }

    }
}
