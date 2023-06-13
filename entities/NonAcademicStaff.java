package org.example.entities;

public class NonAcademicStaff extends Staff {
    private String role;
    private int workingHours;

    public NonAcademicStaff(String name, String qualification, double salary, String role, int workingHours){
        super(name, qualification, salary);
        this.role = role;
        this.workingHours = workingHours;
    }


    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    @Override
    public String toString(){
        return  "NonAcademicStaff{" +
                "role=" + role +
                ", workingHours=" + workingHours +
                "}";

    }
}
