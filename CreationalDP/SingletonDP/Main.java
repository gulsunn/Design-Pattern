package DesignPattern.CreationalDP.SingletonDP;

public class Main {
    public static void main(String[] args) {

        //SingleObject sınıfında bulunan instance nesnesine erişelim (Class adından erişiyoruz)

        SingleObject object1=SingleObject.getInstance();
        System.out.println(object1.message);  // Merhaba

        object1.changeMessage();
        System.out.println(object1.message); // Merhaba Dünya

        SingleObject object2= SingleObject.getInstance();
        System.out.println(object2.message); // Merhaba Dünya  object2 = object2

    }
}
