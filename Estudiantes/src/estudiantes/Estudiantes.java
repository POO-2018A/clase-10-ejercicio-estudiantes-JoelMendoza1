
package estudiantes;


import java.util.Date;

public class Estudiantes {
    
private String nombre;
private String apellidos;
private String cedula;
private Date fechadenacimiento;
private String[] materias;

    public Estudiantes(String nombre, String apellidos, String cedula) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setFechadenacimiento(Date fechadenacimiento) {
        this.fechadenacimiento = fechadenacimiento;
    }

 

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCedula() {
        return  cedula;
    }

    public Date getFechadenacimiento() {
        return  fechadenacimiento;
    }

    public String[] getMaterias() {
        return  materias;
    }

    public void setMaterias(String[] materias) {
        this.materias = materias;
    }

  

   
    public static void main(String[] args) {
      
       
        
    }
    
}
