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
        if (t.getId() == toy.getId()) {
            t.setQuantity(t.getQuantity() + toy.getQuantity());
            foundToy = true;
            break;
        }
    }

    if (!foundToy) {

        toys.add(toy);
    }
 }

//Создание метода изменения веса игрушек

public void setWeight (int toyId, double weight) {
    for (Toy t : toys) {
        if (t.getId() == toyId) {
            t.setWeight(weight);
        }
    }
}

//Создание метода получения списка игрушек (id, название, количество, вес)

public ArrayList<String> getToyList() {
    ArrayList<String> toyList = new ArrayList<>();
    for (Toy t : toys) {
        toyList.add("ID:" + t.getId() + "Название:" + t.getName() + "Количество:" + t.getQuantity() + "Вес:" + t.getWeight());
    }

    return toyList;
}

//Создание метода розыгрыша

public ArrayList<Toy> playGame(int count) {
    ArrayList<Toy> winners = new ArrayList<>();
    double weightSum = 0;
    for (Toy t : toys) {
        weightSum += t.getWeight();

    }

    Random random = new Random();
    for (int i = 0; i < count; i++) {
        double randomNumber = random.nextDouble()*weightSum;
        double currentSum = 0;
        for (Toy t : toys) {
            currentSum += t.getWeight();
            if (currentSum >= randomNumber) {
                if (t.getQuantity() > 0) {
                    winners.add(t);
                    t.setQuantity(t.getQuantity() - 1);
                    weightSum -= t.getWeight();
                }

                break;
                
            }
        }
    }

    return winners;
}









 
}




