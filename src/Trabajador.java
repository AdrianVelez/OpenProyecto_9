public class Trabajador extends Persona{

    double salario;


    public double getSalario(){
        return this.salario;

    }

    public void setSalario(double salario){
        this.salario = salario;

    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "salario=" + salario + " Clase Padre: " +
                super.toString() +
                '}';
    }
}
