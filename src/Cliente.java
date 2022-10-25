public class Cliente extends Persona {

    boolean credito;

    public boolean getCredito() {
        return credito;
    }

    public void setCredito(boolean credito) {
        this.credito = credito;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "credito=" + credito + " Clase Padre: "+
                super.toString() +
                '}';
    }
}
