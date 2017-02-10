/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gf.entity;

import java.util.Date;

/**
 *
 * @author Houssem
 */
public class Shout {
    
  private   int id_shout ;
  private  String text ;
 private    Date date_pub ;

    public Shout(int id_shout, String text, Date date_pub) {
        this.id_shout = id_shout;
        this.text = text;
        this.date_pub = date_pub;
    }

    public int getId_shout() {
        return id_shout;
    }

    public void setId_shout(int id_shout) {
        this.id_shout = id_shout;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate_pub() {
        return date_pub;
    }

    public void setDate_pub(Date date_pub) {
        this.date_pub = date_pub;
    }
    
    
    
    
    
}
