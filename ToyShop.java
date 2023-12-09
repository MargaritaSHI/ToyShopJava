import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class ToyShop {

    private ArrayList<Toy> toys;

    public ToyShop() {
        toys = new ArrayList<>();
    }

//Создание метода добавления игрушек

public void add(Toy toy) {
    boolean foundToy = false;
    for (Toy t : toys) {
        if (t.getID() == toy.getID()) {
            t.setQuantity(t.getQuantity() + toy.getQuantity());
            foundToy = true;
            break;
        }
    }

    if (!foundToy) {

        toys.add(toy);
    }
 }













 
}




