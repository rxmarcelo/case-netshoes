package br.com.netshoes.mscliente.services;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import br.com.netshoes.mscliente.domains.ClienteDomain;
import br.com.netshoes.mscliente.repositories.ClienteRepository;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

// 

@Service
public class ClienteService {

	// Injetou a classe para acessar as operacoes do repository
	@Autowired
	private ClienteRepository clienteRepository;
	
	
	// Post
	public ClienteDomain inserirCliente(final ClienteDomain  cliente) {
        return clienteRepository.save(cliente);
    }

	
	// Get (todos)
	public List<ClienteDomain> obterClientes(){

			return clienteRepository.findAll();

	}
	
	// Get por Id
	public Optional<ClienteDomain> obterCliente(String id) {
	
			return clienteRepository.findById(id);

	}
	
	// Put
    public ClienteDomain atualizar(final ClienteDomain cliente) {
      
        return clienteRepository.save(cliente);
    }

  
    // Delete
    public void excluir(final String id) {
        if(id == null) {
            throw new EntityNotFoundException("Insira um id para excluir!");
        }

        clienteRepository.deleteById(id);
    }
	
}
