package edu.grsu.web2.backend.rest;

import edu.grsu.web2.backend.entity.Status;
import edu.grsu.web2.backend.projections.StatusView;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

@CrossOrigin(methods = {RequestMethod.GET, RequestMethod.DELETE, RequestMethod.PATCH, RequestMethod.POST, RequestMethod.PUT})
@RepositoryRestResource(collectionResourceRel = "statuses", path = "statuses", excerptProjection = StatusView.class)
public interface StatusRepository extends CrudRepository<Status, Integer> {
}
