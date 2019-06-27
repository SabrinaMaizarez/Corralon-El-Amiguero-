/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dao;

import aplicacion.modelo.dominio.Usuario;
import java.util.List;

/**
 *
 * @author 
 */
public interface IUsuarioDAO {
    /*Usuario validarUsuario(String nombreUsuario, String password);
    Usuario obtenerUsuario(String nombreUsuario);
    Usuario obtenerListaUsuariosActivos();
    void agregar(Usuario unUsuario);
    void modificar(Usuario unUsuario);*/
    Usuario validarUsuario(String nombreUsuario, String password);
    public void agregar(Usuario unUsuario); 
    public void eliminar(Usuario unUsuario);
    public void modificar(Usuario unUsuario);
    public Usuario obtenerUsuario (String nombreUsuario);
    public List<Usuario> obtenerListaUsuariosActivos();
}
