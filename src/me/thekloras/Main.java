package me.thekloras;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList sarasasList = new LinkedList();
        sarasasList.add(1);
        sarasasList.add(1);
        sarasasList.add(2);
        sarasasList.add(2);
        ///sarasasList.add(7474);
        //sarasasList.add(0);
        //sarasasList.add(0);
        //sarasasList.add(-8585);
        //sarasasList.add(0);
        //sarasasList.add(0);

        spausdinti(sarasasList);

        //kodas duplikatams iš LinkedList panaikinimui
        for (int i = 0; sarasasList.size() > i; i++) {
            for (int k = 0; sarasasList.size() > k; k++) {
                try {
                    if (sarasasList.get(i).equals(sarasasList.get(k)) && i != k) {
                        System.out.println("Panaikinamas " + k + "-asis elementas iš LinkedList kurio reikšmė yra " + sarasasList.get(k));
                        sarasasList.remove(k);
                    }
                } catch (IndexOutOfBoundsException e) {
                    System.out.println(e);
                } catch (Exception e) {
                    System.out.println(e);
                }
                //System.out.println(i + " " + k);
            }
        }

        spausdinti(sarasasList);
    }

    //funkcija LinkedList spausdinimui
    public static void spausdinti(LinkedList sarasasList) {
        System.out.println("--------------------------");
        for (int i = 0; sarasasList.size() > i; i++) {
            System.out.print(sarasasList.get(i) + " ");
        }
        System.out.println();
        System.out.println("--------------------------");
    }
}
