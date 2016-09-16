
package clase;

/**
 *
 * @author Payares
 */
public class Cafetera {
     private double Maxima;
    private double Actual;

    public Cafetera() {
        this.Maxima = 1000;
        this.Actual = 0;
    }

    public Cafetera(double C_Maxima, double C_Actual) {
        this.Maxima = C_Maxima;
        if (C_Actual > C_Maxima) {
            this.Actual = C_Maxima;
        } else {
            this.Actual = C_Actual;
        }
    }

   

    public double getCapacidadMaxima() {
        return Maxima;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.Maxima = capacidadMaxima;
    }

    public double getCantidadActual() {
        return Actual;
    }

    public void setCantidadActual(double cantidadActual) {
        this.Actual = cantidadActual;
    }

    public String llenarCafetera() {
        String c;
        this.Actual = this.Maxima;
        c = "Cafetera llena";
        return c;
    }

    public Cafetera llenarTaza(double capacidadTaza) {
        Cafetera r;
        if (capacidadTaza > this.Actual) {
            this.Actual = 0;
        } else {
            this.Actual = this.Actual - capacidadTaza;
        }
        r = new Cafetera(this.Maxima, this.Actual);
        return r;
    }

    public Cafetera vaciarCafetera() {
        Cafetera ca;
        this.Actual = 0;
        ca= new Cafetera(this.Maxima, this.Actual);
        return ca;

    }

    public Cafetera agregarCafe(double C_Cafe) {
        Cafetera ca;
        if (C_Cafe > Maxima) {
            this.Actual = this.Maxima;
        } else {
            this.Actual = this.Actual + C_Cafe;
        }
        ca = new Cafetera(this.Maxima, this.Actual);
        return ca;
    }

   
}
