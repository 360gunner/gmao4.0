package com.microservices.elit.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.microservices.elit.model.AdminUtilisateur;
@RepositoryRestResource(collectionResourceRel = "AdminUtilisateur", path = "AdminUtilisateur")
public interface AdminUtilisateurRepo  extends JpaRepository<AdminUtilisateur, Integer> {

}