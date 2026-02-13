package org.example;

public class Dev {

    private Computer comp;
    private int age = 21;
    private String branch;

    public Dev(){
        System.out.println("Dev constructor running");
    }

    //Injecting branch with constructor injection
    public Dev(String branch){
        this.branch=branch;
        System.out.println("Dev parameterized constructor");
    }

    public int getAge() {
        return age;
    }

    //we are injecting age with Setter Injection
    public void setAge(int age){
        this.age=age;
    }

    public String getBranch(){
        return branch;
    }


    public void build(){

        System.out.println("Working on Awesome project");
        comp.compile();
    }

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }
}
