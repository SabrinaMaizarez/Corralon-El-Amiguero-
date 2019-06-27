/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dao;

import aplicacion.modelo.dominio.Cliente;
import java.util.List;

/**
 *
 * @author fliamaizarez
 */
public interface IClienteDAO {
    Cliente validarCliente(int dni, String usuarioses);
    public void agregar(Cliente unCliente); 
    public void eliminar(Cliente unCliente);
    public void modificar(Cliente unCliente);
    public Cliente obtenerUsuario (int dni);
    public List<Cliente> obtenerListaClientesActivos();
}
