import enums.Builder;
import enums.Type;
import enums.Wood;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private final List<Guitar> guitars;
    public Inventory(){
        guitars = new LinkedList<>();
    }
    public void addGuitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backWood, Wood topWood){
        Guitar guitar = new Guitar(serialNumber,price,builder,type,backWood, model, topWood);
        guitars.add(guitar);
    }
    public List<Guitar> search(Guitar searchGuitar){
        List<Guitar> matchingGuitars = new LinkedList<>();
        for (Guitar guitar : guitars) {
            if(searchGuitar.getBuilder() != guitar.getBuilder()) continue;
            String model = searchGuitar.getModel();
            if(model!=null && !model.equals("") && !model.equals(guitar.getModel())) continue;
            if(searchGuitar.getType()!= guitar.getType()) continue;
            if(searchGuitar.getBackWood()!= guitar.getBackWood()) continue;
            if(searchGuitar.getTopWood()!= guitar.getTopWood()) continue;
            matchingGuitars.add(guitar);
        }
        return matchingGuitars;
    }
}
