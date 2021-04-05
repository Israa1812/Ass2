package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Room {

    @Id
    @GeneratedValue
    @Column(name = "IdRoom")
    private int IdRoom;
    @Column(name = "typeRoom")
    private String typeRoom;
    @Column(name = "isVailed")
    private boolean isVailed ;
    @Column(name = "nameCustmor")
    private String nameCustmor;

    public Room() {
    }
    public int getIdRoom() {
        return IdRoom;
    }
    public void setIdRoom(int idRoom) {
        IdRoom = idRoom;
    }

    public String getTypeRoom() {
        return typeRoom;
    }

    public void setTypeRoom(String typeRoom) {
        this.typeRoom = typeRoom;
    }

    public boolean isVailed() {
        return isVailed;
    }

    public void setVailed(boolean vailed) {
        isVailed = vailed;
    }

    public String getNameCustmor() {
        return nameCustmor;
    }

    public void setNameCustmor(String nameCustmor) {
        this.nameCustmor = nameCustmor;
    }
}