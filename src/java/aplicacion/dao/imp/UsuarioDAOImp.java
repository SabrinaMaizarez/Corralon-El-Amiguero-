package aplicacion.dao.imp;


import aplicacion.dao.IUsuarioDAO;
import aplicacion.hibernate.configuracion.NewHibernateUtil;
import aplicacion.modelo.dominio.Usuario;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author
 */
public class UsuarioDAOImp implements IUsuarioDAO{

    @Override
    public Usuario validarUsuario(String nombreUsuario, String password) {
        Usuario u = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Criteria criteria = session.createCriteria(Usuario.class);
        criteria.add(Restrictions.like("nombreUsuario", nombreUsuario));
        criteria.add(Restrictions.like("password", password));
        if (!criteria.list().isEmpty()){
            u = (Usuario)criteria.list().get(0);
        }
        session.getTransaction().commit();
        session.close();
        return u;
    }

    @Override
    public Usuario obtenerUsuario(String nombreUsuario) {
        Usuario u = null;
        Session session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Criteria criteria = session.createCriteria(Usuario.class);
        criteria.add(Restrictions.like("nombreUser", nombreUsuario));
        if (!criteria.list().isEmpty()){
            u = (Usuario)criteria.list().get(0);
        }
        session.getTransaction().commit();
        session.close();
        return u;
    }

    @Override
    public void modificar(Usuario unUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
