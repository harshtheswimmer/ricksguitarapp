import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private final List<Guitar> guitars;
    public Inventory(){
        guitars = new LinkedList<>();
    }
    public void addGuitar(String serialNumber, double price, String builder, String model,String type, String backWood, String topWood){
        Guitar guitar = new Guitar(serialNumber,price,builder,type,backWood, model, topWood);
        guitars.add(guitar);
    }
    public Guitar search(Guitar searchGuitar){
        for (Guitar guitar : guitars) {
            String builder = searchGuitar.getBuilder();
            if ((builder != null) && !builder.equals("") && !builder.equals(guitar.getBuilder())) continue;

            String model = searchGuitar.getModel();
            if ((model != null) && !model.equals("") && !model.equals(guitar.getModel())) continue;

            String backWood = searchGuitar.getBackWood();
            if ((backWood != null) && !backWood.equals("") && !backWood.equals(guitar.getBackWood())) continue;

            String topWood = searchGuitar.getTopWood();
            if ((topWood != null) && !topWood.equals("") && !topWood.equals(guitar.getTopWood())) continue;

            String type = searchGuitar.getType();
            if ((type != null) && !type.equals("") && !type.equals(guitar.getType())) continue;
        }
        return null;
    }
}
