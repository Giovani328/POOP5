/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author duili
 */
public class Carro {
    private int anio;
    private String modelo;
    private int puertas;
    private int rodada;
    private Persona  persona1;
    private Persona  persona2;
    private Persona  persona3;
    private Persona  persona4;
    
    
    public Carro(){}
    public Carro(int anio, String modelo, int puertas, int rodada,String nombre, String apellido, int dia,int  mes, int ano) {
        this.anio = anio;
        this.modelo = modelo;
        this.puertas = puertas;
        this.rodada = rodada;
        persona1=new Persona(nombre, apellido, dia, mes, ano);
        
    }

    public Carro(int anio, String modelo, int puertas, int rodada) {
        this.anio = anio;
        this.modelo = modelo;
        this.puertas = puertas;
        this.rodada = rodada;
    }
    
    public Carro(int anio, String modelo, int puertas, int rodada, Persona persona1, Persona persona2, Persona persona3, Persona persona4) {
        this.anio = anio;
        this.modelo = modelo;
        this.puertas = puertas;
        this.rodada = rodada;
        this.persona1 = persona1;
        this.persona2 = persona2;
        this.persona3 = persona3;
        this.persona4 = persona4;
    }
}
