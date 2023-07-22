package proyecto;

public interface SincroForeBack {
    // Lanzar la tarea
    void Run();
    
    // Información que la tarea manda a la interfaz
    void Start(); // Empezó 
    void Finish(); // Terminó 
    void ProportionExecuted(float p); // Proporción actual para la barra de carga
    void Message(String M); // Número de iteraciones actual para el conteo de puntos

    void nuevoPuntoCuadricula(int x, int y);
    
    boolean Stop(); // Si retorna verdadero la tarea debe terminar
}
