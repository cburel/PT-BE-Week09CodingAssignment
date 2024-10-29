package projects;

import projects.entity.Project;

class ProjectService {

	private ProjectDao projectDao = new ProjectDao();
	
	// adds a new project to the DB
	public Project addProject(Project project) {
		return projectDao.insertProject(project);
	}

}
