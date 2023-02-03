package DesignPattern.BehavioralDP.MediatorDP.Branches;

public interface Dispatcher {  // Danışman Aracı
    void dispatch(String topic, String message);  //Gelen soruları ilgili kişiye yönlendircek  dispatch:danış
}
