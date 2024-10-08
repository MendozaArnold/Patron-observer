

import java.util.ArrayList;
import java.util.List;

public class Sujeto {
    private List<Observador> observadores = new ArrayList<>();
    private String estado;

    public String getNotificacion(){
        return estado;
    }

    public void setNotificacion(String estado){
        this.estado = estado;
        notificarObservadores();
    }

    public void agregarObservador(Observador observador){
        observadores.add(observador);
    }

    public void notificarObservadores(){
        for(Observador observador : observadores){
            observador.Actualizar();
        }
    }
}
