package br.com.netshoes.mscliente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.netshoes.mscliente.domains.ClienteDomain;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteDomain, String> {


}