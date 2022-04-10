package edu.grsu.web2.backend.projections;

public interface IssueView {
    long getId();
    StatusView getStatus();
    String getContent();
}
