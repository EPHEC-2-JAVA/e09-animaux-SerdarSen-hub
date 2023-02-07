package be.ephec.java.exercice.e09;

import java.util.Random;

public class Program {
    public static void main(String[] args) {
        Animal[] animal = new Animal[10];

        Random rng = new Random();
        for (int i = 0; i < animal.length; i++){
            if (rng.nextInt(2) == 0){
                animal[i] = new Dog();
            }else {
                animal[i] = new Cat();
            }
        }
        for (int j = 0; j < animal.length; j++){
            animal[j].makeNoise();
        }
    }
}
