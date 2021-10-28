/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author duili
 */
public class Circulo {
    private float radio;
    
    public Circulo(){
    }
    
    public float perimetro(){
    return 2* (float)Math.PI*radio;
    }
    public float area(){
        return (float)Math.PI*radio*radio;
    }
///////// geters and seters 
    public float getRadio() {
        return radio;
    }
    public void setRadio(float radio) {
        if(radio < 0)
            this.radio = 0;
        else
            this.radio = radio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Circulo{radio=").append(radio);
        sb.append('}');
        return sb.toString();
    }
    
    
}

