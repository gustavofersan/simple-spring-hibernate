package com.gustavofersan.mvn.dao;

import java.util.ArrayList;

import com.gustavofersan.mvn.domain.Contacto;

public interface ContactoDao {

	public void guardarContacto(Contacto contacto);

	public ArrayList<Contacto> contactos();

	public void eliminarContacto(Long id);

}
