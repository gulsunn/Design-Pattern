package DesignPattern.BehavioralDP.MediatorDP.Branches;

public class MediatorRunner {
    public static void main(String[] args) {

        MediatorRunner mediator = new MediatorRunner();
        mediator.mediatorDemo();


    }

    void mediatorDemo(){
        //Dispatcher oluştur

        MessageDispatcher dispatcher = new MessageDispatcher();

        //Aktörleri oluştur

        Actor actor1= new MessageActor("Ali",dispatcher);
        Actor actor2= new MessageActor("Ayşe",dispatcher);
        Actor actor3= new MessageActor("Merve",dispatcher);
        Actor actor4= new MessageActor("Kerem",dispatcher);

        //Aktörleri dispatchera tanıt topikleri ile beraber

        dispatcher.register("Matematik",actor1);
        dispatcher.register("Sosyal Bilimler",actor2);
        dispatcher.register("Fen Bilimleri",actor3);
        dispatcher.register("İngilizce",actor4);

        //Son olarak herhangi bir aktör herhangi bir topikte bir mesaj gönderecek

        actor1.sendMessage("Matematik","4'ün karesi kaçtır");
        actor1.sendMessage("Sosyal Bilimler","Akdeniz Bölgesinde yetişen ürünler");
        actor1.sendMessage("İngilizce","Where are you from");

    }
}
