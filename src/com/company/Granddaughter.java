package com.company;

public final class Granddaughter extends Douther {
    private Costum costum;
    private String school;

    public Costum getCostum() {
        return costum;
    }

    public String getSchool() {
        return school;
    }

    public Granddaughter(int age, String name, String work, Costum costum, String school) {
        super(age, name, work);
        this.costum=costum;
        this.school=school;
    }

    @Override
    public void cook(String name, int portion) {
        System.out.println("Готовит "+name+" порция "+portion);
    }

    @Override
    public String toString() {
        return super.toString()+
                "costum=" + costum +
                ", school='" + school + '\'';
    }
}
