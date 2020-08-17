package br.com.netshoes.mscliente.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.netshoes.mscliente.domains.ClienteDomain;
import br.com.netshoes.mscliente.services.ClienteService;

@RestController
@RequestMapping(value="clientes")
public class ClienteController {
	
	
	@Autowired
	private ClienteService clienteService;
	
	
	@GetMapping("/hello")
	public ResponseEntity<String> helloWorld() {
		
		return new ResponseEntity<String> ("Hello World",HttpStatus.OK);
		
	}
	
	// Incluir
	@PostMapping("/")
	public ClienteDomain inserirCliente(@RequestBody @Valid ClienteDomain dadosPayload){
		
		return clienteService.inserirCliente(dadosPayload);
		
	}
	
	// Listar ou Obter
	@GetMapping("/{id}")
	public Optional<ClienteDomain> obterClientes(@PathVariable("id") String id){
		
		return clienteService.obterCliente(id);		
	}
	
	@GetMapping("/")
	public List<ClienteDomain> obterClientes(){
		
		return clienteService.obterClientes();		
	}
	
	// Atualizar	
	 @PutMapping()
	    public ClienteDomain atualizar(@RequestBody final ClienteDomain dadosPayload) {
	        return clienteService.atualizar(dadosPayload);
	    }
	 
	 // Deletar

	    @DeleteMapping("/{id}")
	    public void excluir(@PathVariable("id") final String id) {
	    	clienteService.excluir(id);
	    }
	
}
