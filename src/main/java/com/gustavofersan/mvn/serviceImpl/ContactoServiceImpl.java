package com.gustavofersan.mvn.serviceImpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.gustavofersan.mvn.dao.ContactoDao;
import com.gustavofersan.mvn.domain.Contacto;
import com.gustavofersan.mvn.service.ContactoService;

public class ContactoServiceImpl implements ContactoService {

	@Autowired
	private ContactoDao contactoDao;
	
	@Override
	public void guardarContacto(Contacto contacto) {
		// TODO Auto-generated method stub
	}

	@Override
	public ArrayList<Contacto> contactos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminarContacto(Long id) {
		// TODO Auto-generated method stub
	}

}
