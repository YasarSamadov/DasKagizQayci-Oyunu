package Oyun;

import java.util.Random;
import java.util.Scanner;

public class DasKagizQayciOyunu {
    public static void main(String[] args) {
        DasKagizQayci();
    }

    public static void DasKagizQayci() {
        while (true) {
            Random rand = new Random();
            String[] secenekler = {"das", "kagiz", "qayci"};

            System.out.println("Das-kagiz-qayci oyununa xos geldiniz");

            System.out.println("zehmet olmasa das, kagiz, das ve qaycidan - birini daxil edesiz");
            String oyuncu = new Scanner(System.in).next();

            if (!oyuncu.equals("das") && !oyuncu.equals("kagiz") && !oyuncu.equals("qayci")) {
                System.out.println("uygun deyil yalniz 3 formadan birini qeyd ele");
            }

            int computerIndex = rand.nextInt(3);

            String computer = secenekler[computerIndex];

            System.out.println("Computer secimi " + computer);
            System.out.println("oyuncu " + oyuncu);

            if (computer.equalsIgnoreCase(oyuncu)) {
                System.out.println("beraber oldu bu oyun");

            } else if (oyuncu.equals("das") && computer.equals("qayci") ||
                    (oyuncu.equals("kagiz") && computer.equals("das")) ||
                    (oyuncu.equals("qayci") && computer.equals("kagiz"))) {
                System.out.println("tebrikler siz oyuncu qazandiniz:)");
            } else {
                System.out.println("teessufler komputer qazandi :|");
            }

            System.out.println("tekrar oynamaq isteyirsiniz? he/yox");
            String davam = new Scanner(System.in).next();
            if (davam.equalsIgnoreCase("yox")) {
                System.out.println("Oyundan cixish...");
                break;

            }
        }
    }

}
