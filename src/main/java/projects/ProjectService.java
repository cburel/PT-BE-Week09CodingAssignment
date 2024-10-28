package projects;

import projects.entity.Project;

class ProjectService {

	private ProjectDao projectDao = new ProjectDao();
	
	public Project addProject(Project project) {
		return projectDao.insertProject(project);
	}

}
