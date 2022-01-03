package com.bugtracking.project.services;

import java.util.List;

import com.bugtracking.project.entities.Project;

public interface IProjectService {

	List<Project> getall();

	Project getproject(long projId);

	String deleteproject(long projId);

	String createproject(Project p);

	String updateproject(long projId, Project p);


}
