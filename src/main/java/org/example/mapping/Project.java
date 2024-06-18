package org.example.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Project {

    @Id
    private int projectId;
    private String projectName;

    @ManyToMany
    private List<Employee> employee;

    public Project(){}

    public Project(int projectId, String projectName, List<Employee> employee){
        this.projectId = projectId;
        this.projectName = projectName;
        this.employee = employee;
    }

    public int getProjectId(){
        return projectId;
    }

    public String getProjectName(){
        return projectName;
    }

    public List<Employee> getEmployee(){
        return employee;
    }

    public void setProjectId(int projectId){
        this.projectId = projectId;
    }

    public void setProjectName(String projectName){
        this.projectName = projectName;
    }

    public void setEmployee(List<Employee> employee){
        this.employee = employee;
    }
}
