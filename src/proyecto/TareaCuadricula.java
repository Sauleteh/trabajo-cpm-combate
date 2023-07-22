package proyecto;

import java.awt.Point;

public class TareaCuadricula extends Tarea {
    // Acceso al interfaz
    private ElegirHeroe Inter;
    private boolean IsStoped;
    
    public TareaCuadricula(ElegirHeroe Inter)
    {
        IsStoped=false;
        this.Inter=Inter;
    }
            
    // Información que manda a la interfaz
    public void Start()
    {
        Inter.PBCuadricula.setValue(0);
        IsStoped=false;
    }
    
    public void Finish()
    {
        Inter.PBCuadricula.setValue(100);

        // Permitir que se pueda volver a ejecutar
        Inter.BPararCuadricula.setEnabled(false);        
        Inter.BEjecutarCuadricula.setEnabled(true);
        Inter.TFCuadricula.setEnabled(true);
    }
    

    public void ProportionExecuted(float p)
    {
        Inter.PBCuadricula.setValue((int)(p*100));
    }
    
    public void Message(String M)
    {
        Inter.LCuadricula.setText(M);
    }
    
    // Información que el interfaz manda al proceso
    public void setStop()
    {
        // Indicar un Stop
        this.IsStoped=true;
    }
    
    public boolean Stop()
    {
        return IsStoped;
    }
    
    @Override
    public void nuevoPuntoCuadricula(int x, int y)
    {
        Inter.paintHeroes.cuadricula.add(new Point(x, y));
        Inter.paintHeroes.repaint();
    }
}
