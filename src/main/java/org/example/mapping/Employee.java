package org.example.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Employee {

    @Id
    private int empID;
    private String empName;

    @ManyToMany(mappedBy = "employee")
    private List<Project> project;

    public Employee(){}

    public Employee(int empID, String empName, List<Project> project){
        this.empID = empID;
        this.empName = empName;
        this.project = project;
    }

    public int getEmpID(){
        return empID;
    }

    public String getEmpName(){
        return empName;
    }

    public List<Project> getProject(){
        return project;
    }

    public void setEmpID(int empID){
        this.empID = empID;
    }

    public void setEmpName(String empName){
        this.empName = empName;
    }

    public void setProject(List<Project> project) {
        this.project = project;
    }
}
