package pacote2;

import java.util.Scanner;

import pacote3.Carro;
import pacote3.Motorista;
import pacote3.PlacaInvalidaException;

public class App {
    public static void main(String[] args) throws Exception {
        Motorista mot = new Motorista("Seu zé", 123);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Informe a placa do carro:");
            String placa = sc.nextLine();

            Carro car = new Carro(placa, 123, mot);
            System.out.println("Placa do carro: " + car.getPlaca());
        } catch (PlacaInvalidaException ex) {
            System.out.println(ex.getMessage());
        } finally {
            sc.close();
        }
    }
}   