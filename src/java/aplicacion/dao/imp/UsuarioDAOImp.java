package aplicacion.dao.imp;


import aplicacion.dao.IUsuarioDAO;
import aplicacion.hibernate.configuracion.NewHibernateUtil;
import aplicacion.modelo.dominio.Usuario;
import java.util.ArrayList;
import java.util.List;
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
        criteria.add(Restrictions.like("estado", true));
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
    public void agregar(Usuario unUsuario) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(unUsuario);
        session.getTransaction().commit();;
        session.close();
    }

    @Override
    public void eliminar(Usuario unUsuario) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        unUsuario.setEstado(false);
        session.getTransaction().commit();;
        session.close();
    }

    @Override
    public void modificar(Usuario unUsuario) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(unUsuario);
        session.getTransaction().commit();;
        session.close();
    }

    @Override
    public List<Usuario> obtenerListaUsuariosActivos() {
        List<Usuario> listado = new ArrayList();
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Criteria criteria = session.createCriteria(Usuario.class);
        criteria.add(Restrictions.like("estado", true));
        listado = criteria.list();
        session.getTransaction().commit();
        session.close();
        return listado;
    }
    
}
