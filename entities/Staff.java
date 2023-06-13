package org.example.entities;

public abstract class Staff {
    private String name;
    private String qualification;
    private  double salary;


    public Staff(String name, String qualification, double salary){
        this.name = name;
        this.qualification = qualification;
        this.salary = salary;

    }

    public Staff(){

    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQualification(){
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", qualification='" + qualification + '\'' +
                ", salary=" + salary +
                '}';
    }
}
