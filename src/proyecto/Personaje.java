/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author UO279176
 */
public class Personaje {
    
    private String nombre;
    private int vida, atq, def, pCrit, fatigaInicial;
    private int vidaActual, fatigaActual;
    
    public Personaje(String n, int v, int a, int d, int p, int f)
    {
        this.setNombre(n);
        this.setVida(v);
        this.setAtaque(a);
        this.setDefensa(d);
        this.setProbCrit(p);
        this.setFatigaI(f);
        this.setVidaActual(v);
        this.setFatigaActual(f);
    }
    
    public Personaje(Personaje j)
    {
        this(j.getNombre(), j.getVida(), j.getAtaque(), j.getDefensa(), j.getProbCrit(), j.getFatigaI());
    }
    
    public void setNombre(String nom) {this.nombre = nom;}
    public void setVida(int vid) {this.vida = vid;}
    public void setAtaque(int a) {this.atq = a;}
    public void setDefensa(int d) {this.def = d;}
    public void setProbCrit(int pc) {this.pCrit = pc;}
    public void setFatigaI(int fi) {this.fatigaInicial = fi;}
    public void setVidaActual(int va) {this.vidaActual = va;}
    public void setFatigaActual(int fa) {this.fatigaActual = fa;}
    
    public String getNombre() {return this.nombre;}
    public int getVida() {return this.vida;}
    public int getAtaque() {return this.atq;}
    public int getDefensa() {return this.def;}
    public int getProbCrit() {return this.pCrit;}
    public int getFatigaI() {return this.fatigaInicial;}
    public int getVidaActual() {return this.vidaActual;}
    public int getFatigaActual() {return this.fatigaActual;}
    
}
