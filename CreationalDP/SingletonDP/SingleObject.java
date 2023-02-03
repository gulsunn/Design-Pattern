package DesignPattern.CreationalDP.SingletonDP;

public class SingleObject {

    String message = "Merhaba";

    //SingleObject sınıfından bir nesne oluştur (Bu sınıftan)
    private static  SingleObject instance = new SingleObject();  // static

    // constructorın access modifierını private olarak tanımlayalım ki bu sınıftan nesne oluşturulamasın
   private SingleObject() {}

    //Oluşturduğumuz nesneye erişim için getter (public)

    public static SingleObject getInstance() { // static
        return instance;
    }

    public void changeMessage(){

        this.message=this.message +" Dünya";

    }
}

/*

SingleObject sınıfının constructorı bu sınıftan nesne yaratılamaması için private olarak tanımlıdır.
Sınıf içinde bir tane aynı sınıftan instance bulunur ve
bu instance yalnızca getInstance metodu tarafından erişilebilir.
Tüm uygulamanızda bu sınıf üzerinden aynı tek nesneye erişebilirsiniz.

 */
