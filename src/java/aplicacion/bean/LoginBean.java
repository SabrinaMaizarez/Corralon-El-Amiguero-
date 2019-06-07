/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.bean;

import aplicacion.dao.IUsuarioDAO;
import aplicacion.dao.imp.UsuarioDAOImp;
import aplicacion.modelo.dominio.Usuario;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author 
 */
@ManagedBean
@RequestScoped
public class LoginBean {

    
    /**
     * Creates a new instance of LoginBean
     */
    public LoginBean() {
       
        
        
    }
    public Usuario validarUsuario (String nombreUsuario, String password ){
        IUsuarioDAO usuarioDAO = new UsuarioDAOImp();
        return usuarioDAO.validarUsuario(nombreUsuario, password);
    }
            
    
}
