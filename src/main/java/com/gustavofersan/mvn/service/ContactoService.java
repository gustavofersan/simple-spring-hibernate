package com.gustavofersan.mvn.service;

import java.util.ArrayList;

import com.gustavofersan.mvn.domain.Contacto;

public interface ContactoService {

	public void guardarContacto(Contacto contacto);

	public ArrayList<Contacto> contactos();

	public void eliminarContacto(Long id);

}
