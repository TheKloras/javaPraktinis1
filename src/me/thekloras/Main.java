package me.thekloras;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList sarasasList = new LinkedList();
        sarasasList.add(256);
        sarasasList.add(541);
        sarasasList.add(851);
        sarasasList.add(965);
        sarasasList.add(256);
        sarasasList.add(965);
        sarasasList.add(252);
        sarasasList.add(7788);
        sarasasList.add(0);
        sarasasList.add(77);

        spausdinti(sarasasList);

        for(int i = 0;sarasasList.size()>i;i++){
            for(int k = 0;sarasasList.size()>i;i++){
                if(sarasasList.get(i)==sarasasList.get(k)){
                    sarasasList.remove(k);
                }
            }
        }
        spausdinti(sarasasList);
    }
    public static void spausdinti(LinkedList sarasasList){
        for(int i = 0;sarasasList.size()>i;i++){
            System.out.print(sarasasList.get(i) + " ");
        }
        System.out.println("");
        System.out.println("--------------------------");
    }
}
