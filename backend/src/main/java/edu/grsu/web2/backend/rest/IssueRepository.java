package edu.grsu.web2.backend.rest;

import edu.grsu.web2.backend.entity.Issue;
import edu.grsu.web2.backend.projections.IssueView;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "issues", path = "issues", excerptProjection = IssueView.class)
public interface IssueRepository extends CrudRepository<Issue, Long> {

    @EntityGraph(attributePaths = {"status"})
    List<Issue> findAll();

    List<Issue> findAllByStatusId(@Param("statusId") int statusId);
}
