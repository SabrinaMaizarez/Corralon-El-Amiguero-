package aplicacion.modelo.dominio;
// Generated 26/06/2019 21:52:25 by Hibernate Tools 4.3.1




/**
 * Detalle generated by hbm2java
 */
public class Detalle  implements java.io.Serializable {


     private int iddetalle;
     private Factura factura;
     private Integer cantidad;
     private String precioProdCant;
     private int productosCodProducto;

    public Detalle() {
    }

	
    public Detalle(int iddetalle, Factura factura, int productosCodProducto) {
        this.iddetalle = iddetalle;
        this.factura = factura;
        this.productosCodProducto = productosCodProducto;
    }
    public Detalle(int iddetalle, Factura factura, Integer cantidad, String precioProdCant, int productosCodProducto) {
       this.iddetalle = iddetalle;
       this.factura = factura;
       this.cantidad = cantidad;
       this.precioProdCant = precioProdCant;
       this.productosCodProducto = productosCodProducto;
    }
   
    public int getIddetalle() {
        return this.iddetalle;
    }
    
    public void setIddetalle(int iddetalle) {
        this.iddetalle = iddetalle;
    }
    public Factura getFactura() {
        return this.factura;
    }
    
    public void setFactura(Factura factura) {
        this.factura = factura;
    }
    public Integer getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    public String getPrecioProdCant() {
        return this.precioProdCant;
    }
    
    public void setPrecioProdCant(String precioProdCant) {
        this.precioProdCant = precioProdCant;
    }
    public int getProductosCodProducto() {
        return this.productosCodProducto;
    }
    
    public void setProductosCodProducto(int productosCodProducto) {
        this.productosCodProducto = productosCodProducto;
    }




}


