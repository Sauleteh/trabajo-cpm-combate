package proyecto;

abstract public class Tarea implements SincroForeBack {
    
    // Métodos para especificar la tarea a realizar
    private int tamCuadricula = 100;
    private float SegsIte = 0.05F;
    private int ancho = 219;
    private int alto = 172;
    
    public void setTamCuadricula(int tC)
    {
        this.tamCuadricula = tC;
    }
    public void setSegsInte(float SegsIte)
    {
        this.SegsIte=SegsIte;    
    }
    public void setAncho(int an)
    {
        this.ancho = an;
    }
    public void setAlto(int al)
    {
        this.alto = al;
    }
            
    public void Run()
    {
     System.out.println("Empezar");
     Start();// Indica que empieza
     
     int Iters=0;
     
     double nLineasH = this.alto / (double)this.tamCuadricula;
     double nLineasV = this.ancho / (double)this.tamCuadricula;
     
     if (nLineasH > this.alto / this.tamCuadricula) nLineasH = this.alto / this.tamCuadricula;
     else nLineasH = this.alto / this.tamCuadricula - 1;
     
     if (nLineasV > this.ancho / this.tamCuadricula) nLineasV = this.ancho / this.tamCuadricula;
     else nLineasV = this.ancho / this.tamCuadricula - 1;
     
     int nPuntos = (int)nLineasV * this.alto + (int)nLineasH * this.ancho;
             
     //for, for, Iters++, Duerme(), if(Stop()) break;, dibujado, ProportionExecuted(Iters/pTotal), Message;
     for (int i = 0; i < nLineasV; i++)
     {
         for (int j = 0; j < this.alto; j++)
         {
             Iters++;
             Duerme();
             if (Stop()) break;
             System.out.println(nPuntos);
             nuevoPuntoCuadricula(this.tamCuadricula + i*tamCuadricula, j);
             ProportionExecuted((float)Iters / nPuntos);
             Message("Número de puntos: "+Iters+" (iteraciones)");
         }
     }
     
     for (int i = 0; i < nLineasH; i++)
     {
         for (int j = 0; j < this.ancho; j++)
         {
             Iters++;
             Duerme();
             if (Stop()) break;
             
             nuevoPuntoCuadricula(j, this.tamCuadricula + i*tamCuadricula);
             ProportionExecuted((float)Iters / nPuntos);
             Message("Número de puntos: "+Iters+" (iteraciones)");
         }
     }
     
     Finish(); // Indica que termina
    }
    
    // Métodos llamados por Run
    private void Duerme()
    {
        try
        {
            Thread.sleep((int)(SegsIte*1000));
        }
        catch(java.lang.InterruptedException E){}
    }
}
