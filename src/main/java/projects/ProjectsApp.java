package projects;

import projects.dao.DbConnection;

public class ProjectsApp {

  public static void main(String[] args) {
    // connect to projects schema
    DbConnection.getConnection();    
  }

}
