package com.heimdall.resources;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.heimdall.domain.Heimdall;
import com.heimdall.services.HeimdallService;

@RestController
@RequestMapping(value="/heimdall")
public class HeimdallResource {
	
	@Autowired
	private HeimdallService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Heimdall> listar() {
		Heimdall h1 = new Heimdall();
		h1.setEquipamentoNome("asdasd");
		h1.setCity("moreno");
		h1.setStatusMessage("aaaa");
		h1.setImagem("asda");
		h1.setColor("Azul");
		h1.setEquipamentoEndereco("");
		h1.setPlaca("KKK2345");
		h1.setState("");
		h1.setModelYear("2011");
		h1.setSenha("@v@t1@S1st3m@1nt3l1g3nte");
		h1.setModel("");
		h1.setDataS("dd/MM/yyyy HH:mm:ss");
		
		Heimdall h2 = new Heimdall();
		h2.setEquipamentoNome("asdasd");
		h2.setCity("moreno");
		h2.setStatusMessage("aaaa");
		h2.setImagem("asda");
		h2.setColor("Azul");
		h2.setEquipamentoEndereco("");
		h2.setPlaca("KKK2345");
		h2.setState("");
		h2.setModelYear("2011");
		h2.setSenha("@v@t1@S1st3m@1nt3l1g3nte");
		h2.setModel("");
		h2.setDataS("dd/MM/yyyy HH:mm:ss");
		
		List<Heimdall> list = new ArrayList<>();
		
		list.addAll(Arrays.asList(h1, h2));
		return list;
	}
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> insert(@Valid @ModelAttribute("Heimdall") Heimdall heimdall){
		heimdall = service.insert(heimdall);
		URI uri = ServletUriComponentsBuilder.
				fromCurrentRequest().
				path("/{id}").buildAndExpand(heimdall.getId())
				.toUri();
		return ResponseEntity.created(uri).build();
	}

}
