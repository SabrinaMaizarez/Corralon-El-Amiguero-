package aplicacion.modelo.dominio;
// Generated 26/06/2019 21:52:25 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Clientes generated by hbm2java
 */
public class Cliente  implements java.io.Serializable {


     private int dni;
     private String domicilio;
     private String provincia;
     private String pais;
     private Date fechaNac;
     private String telefono;
     private String mail;
     private Set usuarioses = new HashSet(0);

    public Cliente() {
    }

	
    public Cliente(int dni) {
        this.dni = dni;
    }
    public Cliente(int dni, String domicilio, String provincia, String pais, Date fechaNac, String telefono, String mail, Set usuarioses) {
       this.dni = dni;
       this.domicilio = domicilio;
       this.provincia = provincia;
       this.pais = pais;
       this.fechaNac = fechaNac;
       this.telefono = telefono;
       this.mail = mail;
       this.usuarioses = usuarioses;
    }
   
    public int getDni() {
        return this.dni;
    }
    
    public void setDni(int dni) {
        this.dni = dni;
    }
    public String getDomicilio() {
        return this.domicilio;
    }
    
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    public String getProvincia() {
        return this.provincia;
    }
    
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    public String getPais() {
        return this.pais;
    }
    
    public void setPais(String pais) {
        this.pais = pais;
    }
    public Date getFechaNac() {
        return this.fechaNac;
    }
    
    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getMail() {
        return this.mail;
    }
    
    public void setMail(String mail) {
        this.mail = mail;
    }
    public Set getUsuarioses() {
        return this.usuarioses;
    }
    
    public void setUsuarioses(Set usuarioses) {
        this.usuarioses = usuarioses;
    }




}


