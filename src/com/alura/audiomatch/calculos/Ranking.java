package com.alura.audiomatch.calculos;

public class Ranking {
    public void muestraRanking(Clasificable clasificable){
        switch (clasificable.getClasificable()){
            case 1:
                System.out.println("Éxito en reproducciones.");
                break;
            case 2:
                System.out.println("Subiendo en reproducciones.");
                break;
            default:

        }
    }
}
