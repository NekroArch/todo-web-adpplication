package edu.grsu.web2.backend.rest;

import edu.grsu.web2.backend.entity.Status;
import edu.grsu.web2.backend.projections.StatusView;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "statuses", path = "statuses", excerptProjection = StatusView.class)
public interface StatusRepository extends CrudRepository<Status, Integer> {
}
