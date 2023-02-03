package DesignPattern.BehavioralDP.MediatorDP.Branches;

public class MessageActor implements Actor {
    String name;
    Dispatcher dispatcher;  // Dispatcher ile iletişim kuracak  (Actorler birbirini bilmez ama dispacheri bilmesi lazım)

    public MessageActor(String name, Dispatcher dispatcher) {
        this.name = name;
        this.dispatcher = dispatcher;
    }

    @Override
    public void receiveMessage(String message) {

        System.out.println(name+ " received message "+message);

    }

    @Override
    public void sendMessage(String topic, String message) {  //Aktorun dispatchera  göndereceği mesaj ve konusunu paremetre olarak ve r

       dispatcher.dispatch(topic,message);  // Aktör topic ve mesajını dispatcehera(danışmana) iletiyor


    }
}
