package org.example.entities;

public class Principal extends Staff {

    private int principalId;

    public Principal(String name, String qualification, double salary, int principalId) {
        super(name, qualification,salary);
        this.principalId = principalId;
    }

    public int getPrincipalId(){
        return principalId;
    }

    public void setPrincipalId(int principalId) {
        this.principalId = principalId;
    }

    @Override
    public String toString(){
        return "Principal{" +
                "principalId=" + principalId +
                "}";
    }
}
