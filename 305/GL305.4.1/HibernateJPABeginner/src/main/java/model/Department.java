package model;

import jakarta.persistence.*;

@Entity
@Table(name = "DEPARTMENT")

public class Department {
    @Column(name = "DEPARTMENT_ID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer did;
    private String name;
    private String state;


    public Department(String name, String state) {
        this.name = name;
        this.state = state;
    }
    public Department() {
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
