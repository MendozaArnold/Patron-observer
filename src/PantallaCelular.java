

public class PantallaCelular extends Observador{
    public PantallaCelular (Sujeto sujeto){
        this.sujeto = sujeto;
        this.sujeto.agregarObservador(this);
    }

    @Override
    public void Actualizar() {

        System.out.println("celular: " + sujeto.getNotificacion());
        
    }
}
