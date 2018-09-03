
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
private fecha nacimiento;
private fecha ingreso; 

    public Empleado20(String nombre, String apellido, char genero, String imagen, double salario, fecha nacimiento, fecha ingreso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.imagen = imagen;
        this.salario = salario;
        this.nacimiento = nacimiento;
        this.ingreso = ingreso;
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

    public fecha getNacimiento() {
        return nacimiento;
    }

    public fecha getIngreso() {
        return ingreso;
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

    public void setNacimiento(fecha nacimiento) {
        this.nacimiento = nacimiento;
    }

    public void setIngreso(fecha ingreso) {
        this.ingreso = ingreso;
    }


    }
    

