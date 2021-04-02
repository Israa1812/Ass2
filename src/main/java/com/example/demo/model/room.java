package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class room {

    @Id
    @GeneratedValue
    @Column(name = "IdRoom")
    private int IdRoom;
    @Column(name = "isVailed")
    private boolean isVailed ;
    @Column(name = "nameCustmor")
    private char nameCustmor;

    public room(){
    }

    public int getIdRoom() {
        return IdRoom;
    }

    public void setIdRoom(int idRoom) {
        IdRoom = idRoom;
    }

    public boolean isVailed() {
        return isVailed;
    }

    public void setVailed(boolean vailed) {
        isVailed = vailed;
    }

    public char getNameCustmor() {
        return nameCustmor;
    }

    public void setNameCustmor(char nameCustmor) {
        this.nameCustmor = nameCustmor;
    }

}
