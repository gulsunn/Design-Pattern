package DesignPattern.BehavioralDP.MediatorDP.ChatRoom;

public class MRunner {
    public static void main(String[] args) {

        ChatRoomMediator chatRoomMediator= new ChatRoomMediator();

        Participant Ali= new Participant("Ali");
        Participant Merve= new Participant("Merve");
        Participant Berat= new Participant("Berat");

        chatRoomMediator.register(Ali);
        chatRoomMediator.register(Merve);
        chatRoomMediator.register(Berat);

      //  System.out.println(chatRoomMediator.registeredParticipiants);

        Ali.sendMessage("Merve"," Merhaba");
        Merve.sendMessage("Berat"," Merhaba Nasılgidiyor");
        Berat.sendMessage("Merve"," iyiyim teşekkürler sen nasılsın");

    }
}
