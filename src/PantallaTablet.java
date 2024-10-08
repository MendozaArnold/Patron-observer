

public class PantallaTablet extends Observador{
    public PantallaTablet (Sujeto sujeto){
        this.sujeto = sujeto;
        this.sujeto.agregarObservador(this);
    }

    @Override
    public void Actualizar() {

        System.out.println("tablet: " + sujeto.getNotificacion());
        
    }
}
