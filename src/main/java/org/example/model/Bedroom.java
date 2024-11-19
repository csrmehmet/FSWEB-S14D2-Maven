package org.example.model;

public class Bedroom {
    private String name;
    private  Wall wall1,wall2,wall3,wall4;
    private Ceiling ceiling;
    private  Bed bed;
    private  Lamp lamp;
    private  Wardrobe wardrobe;
    private Carpet carpet;

    public Bedroom(String name, Carpet carpet, Wardrobe wardrobe, Lamp lamp, Bed bed, Ceiling ceiling, Wall wall1,
                   Wall wall2, Wall wall3, Wall wall4) {
        this.name = name;
        this.carpet = carpet;
        this.wardrobe = wardrobe;
        this.lamp = lamp;
        this.bed = bed;
        this.ceiling = ceiling;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Carpet getCarpet() {
        return carpet;
    }

    public void setCarpet(Carpet carpet) {
        this.carpet = carpet;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    public void setWardrobe(Wardrobe wardrobe) {
        this.wardrobe = wardrobe;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public void setLamp(Lamp lamp) {
        this.lamp = lamp;
    }

    public Bed getBed() {
        return bed;
    }

    public void setBed(Bed bed) {
        this.bed = bed;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public void setCeiling(Ceiling ceiling) {
        this.ceiling = ceiling;
    }

    public Wall getWall4() {
        return wall4;
    }

    public void setWall4(Wall wall4) {
        this.wall4 = wall4;
    }

    public Wall getWall3() {
        return wall3;
    }

    public void setWall3(Wall wall3) {
        this.wall3 = wall3;
    }

    public Wall getWall2() {
        return wall2;
    }

    public void setWall2(Wall wall2) {
        this.wall2 = wall2;
    }

    public Wall getWall1() {
        return wall1;
    }

    public void setWall1(Wall wall1) {
        this.wall1 = wall1;
    }
}
