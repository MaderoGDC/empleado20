
package empleado2.pkg0;

/**
 *
 * @author Estudiante
 */
public class Empleado20 {

private String nombre;
private String apellido;
private char genero;
private String imagen;
private double salario;
private fecha fenacimiento;
private fecha feingreso; 

    public Empleado20(String nombre, String apellido, char genero, String imagen, double salario, fecha fenacimiento, fecha feingreso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.imagen = imagen;
        this.salario = salario;
        this.fenacimiento = fenacimiento;
        this.feingreso = feingreso;
    }
    public Empleado20(){
        this.nombre = "";
        this.apellido = "";
        this.genero = 'n';
        this.imagen = "";
        this.salario = 0;
        this.fenacimiento = new fecha();
        this.feingreso = new fecha();
    }


    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public char getGenero() {
        return genero;
    }

    public String getImagen() {
        return imagen;
    }

    public double getSalario() {
        return salario;
    }

    public fecha getfenacimiento() {
        return fenacimiento;
    }

    public fecha getfeingreso() {
        return feingreso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setfenacimiento(fecha fenacimiento) {
        this.fenacimiento = fenacimiento;
    }

    public void setfeingreso(fecha feingreso) {
        this.feingreso = feingreso;
    }

    @Override
    public String toString() {
        return "Empleado20{" + "nombre=" + nombre + ", apellido=" + apellido + ", genero=" + genero + ", imagen=" + imagen + ", salario=" + salario + ", fenacimiento=" + fenacimiento + ", feingreso=" + feingreso + '}';
    }


    }
    

