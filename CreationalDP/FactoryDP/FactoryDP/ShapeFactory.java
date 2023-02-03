package DesignPattern.CreationalDP.FactoryDP.FactoryDP;

public class ShapeFactory {  // Shape Factory üretiyoruz bu Class içindeki sekilCiz metodu çağırılacak.

    public Sekil sekilCiz(String type){

        if(type==null){
            return null;
        }
        if(type.equalsIgnoreCase("DAİRE")){
            return new Daire();
        }
        if(type.equalsIgnoreCase("DİKDORTGEN")){
            return new Dikdortgen();
        }
        if(type.equalsIgnoreCase("ÜÇGEN")){
            return new Ucgen();
        }
        return null;

    }
}
