package com.lab111.labwork6;

import com.lab111.labwork6.element.*;
import com.lab111.labwork6.visitor.*;
import com.lab111.labwork6.structure.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NetworkStructure network = new NetworkStructure();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nОберіть дію:");
            System.out.println("1. Додати кабель");
            System.out.println("2. Додати сервер");
            System.out.println("3. Додати робочу станцію");
            System.out.println("4. Розрахувати загальну вартість");
            System.out.println("5. Вийти");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера

            switch (choice) {
                case 1:
                    System.out.print("Введіть довжину кабелю: ");
                    int length = scanner.nextInt();
                    System.out.print("Введіть ціну за метр: ");
                    double pricePerMeter = scanner.nextDouble();
                    network.addElement(new Cable(length, pricePerMeter));
                    break;
                case 2:
                    System.out.print("Введіть модель сервера: ");
                    String serverModel = scanner.nextLine();
                    System.out.print("Введіть ціну сервера: ");
                    double serverPrice = scanner.nextDouble();
                    network.addElement(new Server(serverModel, serverPrice));
                    break;
                case 3:
                    System.out.print("Введіть модель робочої станції: ");
                    String workstationModel = scanner.nextLine();
                    System.out.print("Введіть ціну робочої станції: ");
                    double workstationPrice = scanner.nextDouble();
                    System.out.print("Введіть кількість: ");
                    int quantity = scanner.nextInt();
                    network.addElement(new Workstation(workstationModel, workstationPrice, quantity));
                    break;
                case 4:
                    CostCalculator calculator = new CostCalculator();
                    network.accept(calculator);
                    System.out.println("Загальна вартість мережевої структури: " + calculator.getTotalCost() + " грн");
                    break;
                case 5:
                    System.out.println("Дякуємо за використання програми!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Невірний вибір. Спробуйте ще раз.");
            }
        }
    }
}