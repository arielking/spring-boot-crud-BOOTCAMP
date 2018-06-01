package com.unilever.developer.domain;


import javax.persistence.*;
import java.util.Date;

@Entity
public class Cards {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private String name;
    private String description;
    private String level_s5;
    private String priority;
    @ManyToOne
    private Area area;
    @ManyToOne
    private Machine machine;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getLevel_s5() {
        return level_s5;
    }

    public void setLevel_s5(String level_s5) {
        this.level_s5 = level_s5;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public Machine getMachine() {
        return machine;
    }

    public void setMachine(Machine machine) {
        this.machine = machine;
    }

    public Cards() {
    }

    public Cards(String name, String description, String level_s5, String priority, Area area, Machine machine) {
        this.name = name;
        this.description = description;
        this.level_s5 = level_s5;
        this.priority = priority;
        this.area = area;
        this.machine = machine;
    }
}
