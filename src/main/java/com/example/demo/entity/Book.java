package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Book {

    @Id
    @GeneratedValue
    @Column(name = "IdBook")
    private int IdBook;
    @Column(name = "IdRoom")
    private int IdRoom;
    @Column(name = "is_vailed")
    private boolean is_vailed ;
    @Column(name = "nameCustmor")
    private String nameCustmor;

    public Book() {
    }

    public int getIdBook() {
        return IdBook;
    }

    public void setIdBook(int idBook) {
        IdBook = idBook;
    }

    public int getIdRoom() {
        return IdRoom;
    }

    public void setIdRoom(int idRoom) {
        IdRoom = idRoom;
    }

    public boolean isIs_vailed() {
        return is_vailed;
    }

    public void setIs_vailed(boolean is_vailed) {
        this.is_vailed = is_vailed;
    }
    public String getNameCustmor() {
        return nameCustmor;
    }

    public void setNameCustmor(String nameCustmor) {
        this.nameCustmor = nameCustmor;
    }
}

