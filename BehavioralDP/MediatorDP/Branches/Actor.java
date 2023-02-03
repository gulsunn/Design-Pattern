package DesignPattern.BehavioralDP.MediatorDP.Branches;

public interface Actor {  //Etraftakiler

    void receiveMessage(String message);  // Kendine gelen mesajı almak için

    void sendMessage(String topic,String message);  // Kendi alanı dışında soru soracağı zaman bu methodu kullanacak mesajın dışında konuyuda göndermeli aracıya



}
