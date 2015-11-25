/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Azusu
 */
@Entity
@Table(name = "Admin")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Admin.findAll", query = "SELECT a FROM Admin a"),
    @NamedQuery(name = "Admin.findByFKUser", query = "SELECT a FROM Admin a WHERE a.fKUser = :fKUser")})
public class Admin implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "FK_User")
    private Integer fKUser;
    @JoinColumn(name = "FK_User", referencedColumnName = "ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private User user;

    public Admin() {
    }

    public Admin(Integer fKUser) {
        this.fKUser = fKUser;
    }

    public Integer getFKUser() {
        return fKUser;
    }

    public void setFKUser(Integer fKUser) {
        this.fKUser = fKUser;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fKUser != null ? fKUser.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Admin)) {
            return false;
        }
        Admin other = (Admin) object;
        if ((this.fKUser == null && other.fKUser != null) || (this.fKUser != null && !this.fKUser.equals(other.fKUser))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "backend.Admin[ fKUser=" + fKUser + " ]";
    }
    
}
