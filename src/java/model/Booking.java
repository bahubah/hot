/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.model;

import java.util.Objects;
/**
 *
 * @author nurzh
 */
public class Booking {
    private int id;
    private int id_user;
    private int id_content;
    private String title1;
    
    
    public Booking() {
    }

    public Booking(int id, int id_user, int id_content, String title1) {
        this.id = id;
        this.id_user = id_user;
        this.id_content = id_content;
        this.title1 = title1;       
    }

    public int getId() {
        return id;
    }

    public int getId_user() {
        return id_user;
    }

    public int getId_content() {
        return id_content;
    }

    public String getTitle1() {
        return title1;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public void setId_content(int id_content) {
        this.id_content = id_content;
    }

    public void setTitle1(String title1) {
        this.title1 = title1;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.id;
        hash = 59 * hash + this.id_user;
        hash = 59 * hash + this.id_content;
        hash = 59 * hash + Objects.hashCode(this.title1);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Booking other = (Booking) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.id_user != other.id_user) {
            return false;
        }
        if (this.id_content != other.id_content) {
            return false;
        }
        if (!Objects.equals(this.title1, other.title1)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Booking{" + "id=" + id + ", id_user=" + id_user + ", id_content=" + id_content + ", title1=" + title1 + '}';
    }

       
    
}
    