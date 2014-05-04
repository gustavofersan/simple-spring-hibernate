package com.gustavofersan.mvn.daoImpl;

import java.util.ArrayList;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gustavofersan.mvn.dao.ContactoDao;
import com.gustavofersan.mvn.domain.Contacto;

@Repository
public class ContactoDaoImpl implements ContactoDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void guardarContacto(Contacto contacto) {
		sessionFactory.getCurrentSession().save(contacto);
	}

	@Override
	@SuppressWarnings("unchecked")
	public ArrayList<Contacto> contactos() {
		return (ArrayList<Contacto>) sessionFactory.getCurrentSession()
				.createQuery("from Contacto").list();
	}

	@Override
	public void eliminarContacto(Long id) {
		Contacto contactoforDelete = (Contacto) sessionFactory.getCurrentSession().load(
				Contacto.class, id);
		if (contactoforDelete != null) {
			sessionFactory.getCurrentSession().delete(contactoforDelete);
		}
	}

}
