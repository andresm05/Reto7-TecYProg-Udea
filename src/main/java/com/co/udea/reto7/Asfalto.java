package com.co.udea.reto7;

/**
 *
 * @author HOME
 */
public class Asfalto extends Tramo {
    
    public final double ANCHO = 8;
    public final double ESPESOR = 0.25; 
    private String proveedor;
    private double vMax;
    private boolean prohibido;
    
    public Asfalto(double xInicial, double xFinal, double yInicial, double yFinal) {
        super(xInicial, xFinal, yInicial, yFinal);
    }

    public Asfalto(String proveedor, double vMax, boolean prohibido, double xInicial, double xFinal, double yInicial, double yFinal) {
        super(xInicial, xFinal, yInicial, yFinal);
        this.proveedor = proveedor;
        this.vMax = vMax;
        this.prohibido = prohibido;
    }
    
    

    @Override
    public double getArea() {
        double area = this.longitud()*ANCHO;
        return area;
    }

    @Override
    public double getVolumen() {
        double volumen = ANCHO*ESPESOR*this.longitud();
        return volumen;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public double getvMax() {
        return vMax;
    }

    public void setvMax(double vMax) {
        this.vMax = vMax;
    }

    public boolean isProhibido() {
        return prohibido;
    }

    public void setProhibido(boolean prohibido) {
        this.prohibido = prohibido;
    }
    
}
