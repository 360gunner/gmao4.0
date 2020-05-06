package com.microservices.elit.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.microservices.elit.model.AchatArrivage;
import com.microservices.elit.model.AchatEngagement;
@RepositoryRestResource(collectionResourceRel = "AchatEngagement", path = "AchatEngagement")
public interface AchatEngagementRepo  extends JpaRepository<AchatEngagement, Integer> {

}