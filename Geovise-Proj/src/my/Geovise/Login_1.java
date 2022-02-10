/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.Geovise;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Joe Tingle
 */
@Entity
@Table(name = "Login", catalog = "sql8133165", schema = "")
@NamedQueries({
    @NamedQuery(name = "Login_1.findAll", query = "SELECT l FROM Login_1 l"),
    @NamedQuery(name = "Login_1.findByHighestScore", query = "SELECT l FROM Login_1 l WHERE l.highestScore = :highestScore")})
public class Login_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Lob
    @Column(name = "Username")
    @Id
    private String username;
    @Basic(optional = false)
    @Lob
    @Column(name = "Password")
    private String password;
    @Lob
    @Column(name = "Notes1")
    private String notes1;
    @Lob
    @Column(name = "Notes2")
    private String notes2;
    @Lob
    @Column(name = "Notes3")
    private String notes3;
    @Column(name = "HighestScore")
    private Integer highestScore;

    public Login_1() {
    }


    public Login_1(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        String oldUsername = this.username;
        this.username = username;
        changeSupport.firePropertyChange("username", oldUsername, username);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        String oldPassword = this.password;
        this.password = password;
        changeSupport.firePropertyChange("password", oldPassword, password);
    }

    public String getNotes1() {
        return notes1;
    }

    public void setNotes1(String notes1) {
        String oldNotes1 = this.notes1;
        this.notes1 = notes1;
        changeSupport.firePropertyChange("notes1", oldNotes1, notes1);
    }

    public String getNotes2() {
        return notes2;
    }

    public void setNotes2(String notes2) {
        String oldNotes2 = this.notes2;
        this.notes2 = notes2;
        changeSupport.firePropertyChange("notes2", oldNotes2, notes2);
    }

    public String getNotes3() {
        return notes3;
    }

    public void setNotes3(String notes3) {
        String oldNotes3 = this.notes3;
        this.notes3 = notes3;
        changeSupport.firePropertyChange("notes3", oldNotes3, notes3);
    }

    public Integer getHighestScore() {
        return highestScore;
    }

    public void setHighestScore(Integer highestScore) {
        Integer oldHighestScore = this.highestScore;
        this.highestScore = highestScore;
        changeSupport.firePropertyChange("highestScore", oldHighestScore, highestScore);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
