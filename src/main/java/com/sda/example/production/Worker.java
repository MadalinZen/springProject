package com.sda.example.production;

import java.util.List;

public class Worker {

    private String profession ;

    private int age ;

     private List<Tool> tools ;

    private WorkerMotto workerMotto ;

    public Worker(){}

    public Worker(String profession,int age,WorkerMotto workerMotto ){

        this.profession = profession;

        this.age = age;

        this.workerMotto = workerMotto ;

    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Tool> getTools() {
        return tools;
    }

    public void setTools(List<Tool> tools) {
        this.tools = tools;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "profession='" + profession + '\'' +
                ", age=" + age +
                ", tools=" + tools +
                ", workerMotto=" + workerMotto +
                '}';
    }
}
