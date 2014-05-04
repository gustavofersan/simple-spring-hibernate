package com.gustavofersan.mvn.serviceImpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gustavofersan.mvn.dao.ContactoDao;
import com.gustavofersan.mvn.domain.Contacto;
import com.gustavofersan.mvn.service.ContactoService;

@Service
public class ContactoServiceImpl implements ContactoService {

	@Autowired
	private ContactoDao contactoDao;

	@Transactional
	@Override
	public void guardarContacto(Contacto contacto) {
		contactoDao.guardarContacto(contacto);
	}

	@Transactional
	@Override
	public ArrayList<Contacto> contactos() {
		return contactoDao.contactos();
	}

	@Transactional
	@Override
	public void eliminarContacto(Long id) {
		contactoDao.eliminarContacto(id);
	}

}
