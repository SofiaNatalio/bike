package org.academiadecodigo.hackathon.Model;

import javax.persistence.*;
import java.util.Date;



@Entity
@Table(name = "biker")
public class Biker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Version
    private Integer version;

    private String name;

    private String username;

    private String password;

    private String distance;

    private Date birthdate;

    private Integer level;

    private Integer score;

    private String gender;

    //Setters


    public void setVersion(Integer version) {
        this.version = version;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    //Getters


    public Integer getVersion() {
        return version;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getDistance() {
        return distance;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public Integer getLevel() {
        return level;
    }

    public Integer getScore() {
        return score;
    }

    public String getGender() {
        return gender;
    }
}
