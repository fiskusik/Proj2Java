import java.util.Random;
import java.util.Scanner;

public class Tablica {
    public static <x> void main(String args[]) {
        //dane podstawowe
        String nazwa_segmentu_1 = "A1";
        String nazwa_segmentu_2 = "A2";
        String nazwa_segmentu_3 = "B1";
        String nazwa_segmentu_4 = "B2";

        //generowanie w segmencie A1
        int i_A1 = 123;
        Random liczba_A1 = new Random();
        int los_A1 = liczba_A1.nextInt(i_A1);
        System.out.print("Wygenerowana wartość liczby, ilość liczb znajdujących w segmencie: " + nazwa_segmentu_1 + " wynosi: " + los_A1 + ".\n");
        for (i_A1 = 1; i_A1 < los_A1; i_A1++) {
            int podzielnik = 2;
            boolean liczbaPierwsza = true;
            if (i_A1 > 3) {
                while (podzielnik < i_A1) {
                    if (i_A1 % podzielnik == 0) {
                        liczbaPierwsza = false;
                        break;
                    }
                    podzielnik++;
                }
            }
            if (liczbaPierwsza) {
                System.out.println("Liczba pierwsza w segmencie A1: " + i_A1);
            }
        }
        //dodawanie liczb
        int[] numbers_A1 = {i_A1, i_A1, i_A1, i_A1, i_A1, i_A1, i_A1, i_A1, i_A1};
        int suma_A1 = 0;
        for (int y = 0; y <= 2; y++) {
            suma_A1 += numbers_A1[y];
        }
        System.out.print("Informacja (suma 10 przykładowych pierwszych liczb wcześniej wygenerowanych): " + suma_A1 + ".\n");


        //generowanie w segmencie A2
        int i_A2 = 123;
        Random liczba_A2 = new Random();
        int los_A2 = liczba_A2.nextInt(i_A2);
        System.out.print("Wygenerowana wartość liczby, ilość liczb znajdujących w segmencie: " + nazwa_segmentu_2 + " wynosi: " + los_A2 + ".\n");
        for (i_A2 = 1; i_A2 < los_A2; i_A2++) {
            int podzielnik = 2;
            boolean liczbaPierwsza = true;
            if (i_A2 > 3) {
                while (podzielnik < i_A2) {
                    if (i_A2 % podzielnik == 0) {
                        liczbaPierwsza = false;
                        break;
                    }
                    podzielnik++;
                }
            }
            if (liczbaPierwsza) {
                System.out.println("Liczba pierwsza w segmencie A1: " + i_A2);
            }
        }
        //dodawanie liczb
        int[] numbers = {i_A2, i_A2, i_A2, i_A2, i_A2, i_A2, i_A2, i_A2, i_A2};
        int suma_A2 = 0;
        for (int y = 0; y <= 2; y++) {
            suma_A2 += numbers[y];
        }
        System.out.print("Informacja (suma 10 przykładowych pierwszych liczb wcześniej wygenerowanych): " + suma_A2 + ".\n");


        //generowanie w segmencie B1
        int i_B1 = 123;
        Random liczba_B1 = new Random();
        int los_B1 = liczba_B1.nextInt(i_B1);
        System.out.print("Wygenerowana wartość liczby, ilość liczb znajdujących w segmencie: " + nazwa_segmentu_3 + " wynosi: " + los_B1 + ".\n");
        for (i_B1 = 1; i_B1 < los_B1; i_B1++) {
            int podzielnik = 2;
            boolean liczbaPierwsza = true;
            if (i_B1 > 3) {
                while (podzielnik < i_B1) {
                    if (i_B1 % podzielnik == 0) {
                        liczbaPierwsza = false;
                        break;
                    }
                    podzielnik++;
                }
            }
            if (liczbaPierwsza) {
                System.out.println("Liczba pierwsza w segmencie A1: " + i_B1);
            }
        }
        //dodawanie liczb
        int[] numbers_B1 = {i_B1, i_B1, i_B1, i_B1, i_B1, i_B1, i_B1, i_B1, i_B1};
        int suma_B1 = 0;
        for (int y = 0; y <= 2; y++) {
            suma_B1 += numbers_B1[y];
        }
        System.out.print("Informacja (suma 10 przykładowych pierwszych liczb wcześniej wygenerowanych): " + suma_B1 + ".\n");

        //generowanie w segmencie B2
        int i_B2 = 123;
        Random liczba_B2 = new Random();
        int los_B2 = liczba_B2.nextInt(i_B2);
        System.out.print("Wygenerowana wartość liczby, ilość liczb znajdujących w segmencie: " + nazwa_segmentu_4 + " wynosi: " + los_B2 + ".\n");
        for (i_B2 = 1; i_B2 < los_B2; i_B2++) {
            int podzielnik = 2;
            boolean liczbaPierwsza = true;
            if (i_B2 > 3) {
                while (podzielnik < i_B2) {
                    if (i_B2 % podzielnik == 0) {
                        liczbaPierwsza = false;
                        break;
                    }
                    podzielnik++;
                }
            }
            if (liczbaPierwsza) {
                System.out.println("Liczba pierwsza w segmencie A1: " + i_B2);
            }
        }
        //dodawanie liczb
        int[] numbers_B2 = {i_B2, i_B2, i_B2, i_B2, i_B2, i_B2, i_B2, i_B2, i_B2};
        int suma_B2 = 0;
        for (int y = 0; y <= 2; y++) {
            suma_B2 += numbers_B2[y];
        }
        System.out.print("Informacja (suma 10 przykładowych pierwszych liczb wcześniej wygenerowanych): " + suma_B2 + ".\n");
        System.out.print("**********Informacja zbiorcza sumowanie pierwszych liczb - 10 szt.**********\n");
        System.out.print("Informacja (suma 10 przykładowych pierwszych liczb wcześniej wygenerowanych): " + suma_A1 + ".\n");
        System.out.print("Informacja (suma 10 przykładowych pierwszych liczb wcześniej wygenerowanych): " + suma_A2 + ".\n");
        System.out.print("Informacja (suma 10 przykładowych pierwszych liczb wcześniej wygenerowanych): " + suma_B1 + ".\n");
        System.out.print("Informacja (suma 10 przykładowych pierwszych liczb wcześniej wygenerowanych): " + suma_B2 + ".\n");
        int[][] tablica;
        tablica = new int[][]{{suma_A1, suma_A2}, {suma_B1, suma_B2}};
        System.out.println("Tablica zbiorcza sumowanie pierwszych liczb - 10 szt: ");
        for (int i = 0; i < tablica.length; i++) {
            int[] wiersz = tablica[i];
            for (int j = 0; j < wiersz.length; j++) {
                if (j == wiersz.length - 1) {
                    System.out.print(wiersz[j]);
                } else {
                    System.out.print(wiersz[j] + ", ");
                }
            }
            System.out.println();
        }
        int infA1 = suma_A1;
        String sinfA1 = Integer.toBinaryString(infA1);
        System.out.println("Liczba binarna sumy 10 przykładowych pierwszych liczb wcześniej wygenerowanych: " + sinfA1);

        int infA2 = suma_A2;
        String sinfA2 = Integer.toBinaryString(infA2);
        System.out.println("Liczba binarna sumy 10 przykładowych pierwszych liczb wcześniej wygenerowanych: " + sinfA2);

        int infB1 = suma_B1;
        String sinfB1 = Integer.toBinaryString(infB1);
        System.out.println("Liczba binarna sumy 10 przykładowych pierwszych liczb wcześniej wygenerowanych: " + sinfB1);

        int infB2 = suma_B2;
        String sinfB2 = Integer.toBinaryString(infB2);
        System.out.println("Liczba binarna sumy 10 przykładowych pierwszych liczb wcześniej wygenerowanych: " + sinfB2);

        int[][] tablica_binarna;
        tablica_binarna = new int[][]{{Integer.parseInt(sinfA1), Integer.parseInt(sinfA2)},{Integer.parseInt(sinfB1), Integer.parseInt(sinfB2)}};
        System.out.println("Tablica zbiorcza sumowanie pierwszych liczb - 10 szt: ");
        for (int i = 0; i < tablica.length; i++) {
            int[] wiersz = tablica_binarna[i];
            for (int j = 0; j < wiersz.length; j++) {
                if (j == wiersz.length - 1) {
                    System.out.print(wiersz[j]);
                } else {
                    System.out.print(wiersz[j] + ", ");
                }
            }
            System.out.println();
        }
    }
}
