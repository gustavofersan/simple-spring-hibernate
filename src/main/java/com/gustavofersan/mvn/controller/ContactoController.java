package com.gustavofersan.mvn.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gustavofersan.mvn.domain.Contacto;
import com.gustavofersan.mvn.service.ContactoService;

@Controller
public class ContactoController {

	@Autowired
	private ContactoService contactoService;

	@RequestMapping("/index")
	public String listContactos(Map<String, Object> map) {
		map.put("contacto", new Contacto());
		map.put("contactoList", contactoService.contactos());
		return "contacto";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addContact(@ModelAttribute("contacto") Contacto contact,
			BindingResult result) {
		contactoService.guardarContacto(contact);
		return "redirect:/index";
	}

	@RequestMapping("/delete/{contactId}")
	public String deleteContact(@PathVariable("contactId") Long contactId) {
		contactoService.eliminarContacto(contactId);
		return "redirect:/index";
	}

}
