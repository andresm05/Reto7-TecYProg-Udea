package com.co.udea.reto7;

import java.util.ArrayList;

/**
 *
 * @author HOME
 */
public class Carretera {

    private ArrayList<Tramo> via;

    public Carretera() {
        via = new ArrayList<>();
    }

    public ArrayList<Tramo> getVia() {
        return via;
    }

    public void setVia(ArrayList<Tramo> via) {
        this.via = via;
    }

    public double getLongitud() {
        double suma = 0;
        if (!via.isEmpty()) {
            for (Tramo tramo : via) {
                suma += tramo.longitud();
            }
        }
        return suma;
    }

    public double getArea() {
        double suma = 0;
        if (!via.isEmpty()) {
            for (Tramo tramo : via) {
                suma += tramo.getArea();
            }
        }
        return suma;
    }

    public double getVolumen() {
        double suma = 0;
        if (!via.isEmpty()) {
            for (Tramo tramo : via) {
                suma += tramo.getVolumen();
            }
        }
        return suma;
    }

    public double getVolumenAsfalto() {
        double suma = 0;
        if (!via.isEmpty()) {
            for (Tramo tramo : via) {
                if (tramo instanceof Asfalto) {
                    suma += tramo.getVolumen();
                }
            }
        }
        return suma;
    }

    public double getVolumenNoAsfalto() {
        double suma = 0;
        if (!via.isEmpty()) {
            for (Tramo tramo : via) {
                if (tramo instanceof NoAsfalto) {
                    suma += tramo.getVolumen();
                }
            }
        }
        return suma;
    }

    public boolean conecta() {
        if (via.size() == 1) {
            return true;
        }
        if (via.isEmpty()) {
            return false;
        }
        int cont = 0;
        for (int i = 0; i < via.size() - 1; i++) {
            if (via.get(i).getxFinal() == via.get(i + 1).getxInicial() && via.get(i).getyFinal() == via.get(i + 1).getyInicial()) {
                cont++;
            }
        }
        return cont == (via.size() - 1);
    }
}
