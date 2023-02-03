package DesignPattern.BehavioralDP.MediatorDP.ChatRoom;

public class Participant {
    String name;

    ChatRoomMediator chatRoomMediator;

    public Participant(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void receiveMessage(String from, String message) {

        System.out.println(from+" den "+name+" e : "+message);

    }

    @Override
    public String toString() {
        return "Participant{" +
                "name='" + name + '\'' +
                ", chatRoomMediator=" + chatRoomMediator +
                '}';
    }

    public void sendMessage(String to, String message) {

       chatRoomMediator.dispatch(name,to,message);


    }
}
