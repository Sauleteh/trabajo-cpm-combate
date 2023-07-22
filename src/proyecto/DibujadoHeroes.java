/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.awt.Color;
import java.awt.Graphics;
import java.util.LinkedList;
import java.awt.Point;
import java.util.Iterator;

/**
 *
 * @author quevedo
 */
public class DibujadoHeroes extends javax.swing.JPanel{
    DibujadoHeroes(){
        super();
        puntos = new LinkedList<>();
        cuadricula = new LinkedList<>();
        C = Color.BLACK;
    }
    
    @Override
    public void paint(Graphics g){
        super.paint(g);

        Iterator<Point> i=puntos.iterator();
        while(i.hasNext()){
            Point p=i.next();
            // Pintar el punto p con el color y radio indicados
            int x = (int)p.getX();
            int y = (int)p.getY();
            g.setColor(C);
            g.fillOval(x-2, y-2, 2*2, 2*2);   
        }
        
        Iterator<Point> j=cuadricula.iterator();
        while (j.hasNext())
        {
            Point p = j.next();
            
            int x = (int)p.getX();
            int y = (int)p.getY();
            g.setColor(Color.GRAY);
            g.fillRect(x, y, 1, 1);
        }
    }
    
    private Color C;
    
    public void setColor(Color col)
    {
        this.C = col;
    }

    public Color getColor()
    {
        return this.C;
    }
    
    public void insertaPunto(Point p){
           puntos.add(p);
    }
    
    public void borra(){
        puntos.clear();
        cuadricula.clear();
    }
    

    
    private LinkedList<Point> puntos; // Puntos que forman el trazo
    protected LinkedList<Point> cuadricula; // Puntos (char) que forma la cuadrícula
}
