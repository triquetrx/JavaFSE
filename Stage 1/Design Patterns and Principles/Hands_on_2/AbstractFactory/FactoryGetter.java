package Handson.Hands_on_2.AbstractFactory;

public class FactoryGetter {
    public static Factory getFactory(String type){
        if (type.equalsIgnoreCase("mercedes")){
            return new MercedesFactory();
        }
        else if (type.equalsIgnoreCase("audi")){
            return new AudiFactory();
        }
        return null;
    }
}
