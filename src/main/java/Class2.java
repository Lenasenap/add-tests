import models.Garment;
import models.Pants;
import models.Shirt;
import models.Shoe;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * I den här testklassen ökar vi klurigheten ett litet snäpp för att öva mer på att skriva tester.
 *
 */
public class Class2 {
    
    public boolean wardrobeIsFull(List<Garment> wardrobe) {
        return wardrobe.size() >= 20;
    }

    public List<Garment> blueGarments(List<Garment> wardrobe) {

        List<Garment> blueGarments = wardrobe.stream()
                .filter(garment -> garment.getColour().equalsIgnoreCase("Blå"))
                .collect(Collectors.toList());

        return blueGarments;
    }

    /**
     * Exempel på hur en 'Wardrobe' skulle kunna se ut.
     * För att kunna använda den här listan behöver ni definiera en Arraylist utanför den här metoden -
     * på klassnivå
     **/
    private List<Garment> createWardrobe() {
        List<Garment> wardrobe = new ArrayList<Garment>();

        wardrobe.add(new Shirt("Blå", "Bomull", "M"));
        wardrobe.add(new Shirt("Gul", "Polyester", "XL"));
        wardrobe.add(new Shoe("Vit", "Plast", 39));
        wardrobe.add(new Shoe("Svart", "Läder", 40));
        wardrobe.add(new Pants("Grå", "Jeans", 168));
        wardrobe.add(new Pants("Röd", "Jeans", 150));

        return wardrobe;
    }
}
