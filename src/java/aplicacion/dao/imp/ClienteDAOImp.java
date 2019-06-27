/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dao.imp;

import aplicacion.dao.IClienteDAO;
import aplicacion.hibernate.configuracion.NewHibernateUtil;
import aplicacion.modelo.dominio.Cliente;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author fliamaizarez
 */
public class ClienteDAOImp implements IClienteDAO{

    @Override
    public Cliente validarCliente(int dni, String usuarioses) {
        Cliente c = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Criteria criteria = session.createCriteria(Cliente.class);
        criteria.add(Restrictions.like("dni", dni));
        criteria.add(Restrictions.like("usuarioses", usuarioses));
        if (!criteria.list().isEmpty()){
            c = (Cliente)criteria.list().get(0);
        }
        session.getTransaction().commit();
        session.close();
        return c;

    }

    @Override
    public void agregar(Cliente unCliente) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(unCliente);
        session.getTransaction().commit();;
        session.close();
    }

    @Override
    public void eliminar(Cliente unCliente) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(unCliente);
        session.getTransaction().commit();;
        session.close();
    }

    @Override
    public void modificar(Cliente unCliente) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(unCliente);
        session.getTransaction().commit();;
        session.close();
    }

    @Override
    public Cliente obtenerUsuario(int dni) {
        Cliente c = null;
        Session session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Criteria criteria = session.createCriteria(Cliente.class);
        criteria.add(Restrictions.like("dni", dni));
        if (!criteria.list().isEmpty()){
            c = (Cliente)criteria.list().get(0);
        }
        session.getTransaction().commit();
        session.close();
        return c;
    }

    @Override
    public List<Cliente> obtenerListaClientesActivos() {
        List<Cliente> listado = new ArrayList();
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Criteria criteria = session.createCriteria(Cliente.class);
        criteria.add(Restrictions.like("estado", true));
        listado = criteria.list();
        session.getTransaction().commit();
        session.close();
        return listado;
    }
    
}
