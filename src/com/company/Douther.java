package com.company;

public class Douther extends Grandmother{
    private String work;

    public String getWork() {
        return work;
    }

    public Douther(int age, String name, String work) {
        super(age, name);
        this.work=work;
    }
    public void cook (String name ,int portion){
        System.out.println("Menu "+name+" portion "+portion);


    }
    public final void cook (String name ){
        System.out.println("Menu "+name);
    }

    @Override
    public String toString() {
        return super.toString()+
                "work='" + work + '\''
                ;
    }
}
