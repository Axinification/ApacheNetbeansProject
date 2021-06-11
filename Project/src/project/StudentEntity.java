/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Olek
 */
@Entity
@Table(name = "Studenci")
@NamedQueries({
    @NamedQuery(name = "StudentEntity.findAll", query = "SELECT s FROM StudentEntity s"),
//    @NamedQuery(name = "Studenci.findById", query = "SELECT s FROM Studenci s WHERE s.id = :id"),
//    @NamedQuery(name = "Studenci.findByImie", query = "SELECT s FROM Studenci s WHERE s.imie = :imie"),
//    @NamedQuery(name = "Studenci.findByNazwisko", query = "SELECT s FROM Studenci s WHERE s.nazwisko = :nazwisko"),
//    @NamedQuery(name = "Studenci.findByImieNazwisko", query = "SELECT s FROM Studenci s WHERE s.imie = :imie and s.nazwisko = :nazwisko"),
//    @NamedQuery(name = "Studenci.findByGrupa", query = "SELECT s FROM Studenci s WHERE s.grupa = :grupa"),
//    @NamedQuery(name = "Studenci.findByMiasto", query = "SELECT s FROM Studenci s WHERE s.miasto = :miasto"),
//    @NamedQuery(name = "Studenci.findByNumerIndeksu", query = "SELECT s FROM Studenci s WHERE s.numerIndeksu = :numerIndeksu")
})
public class StudentEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "Indeks")
    private Integer indeks;
    @Column(name = "Imie")
    private String imie;
    @Column(name = "Nazwisko")
    private String nazwisko;
    @Column(name = "Wydzial")
    private String wydzial;
    @Column(name = "Kierunek")
    private String kierunek;
    @Column(name = "Grupa")
    private String grupa;
    
    public StudentEntity() {
    }
    
    public StudentEntity(Integer id, Integer indeks, String imie, String nazwisko, String wydzial, String kierunek, String grupa) {
        this.id = id;
        this.indeks = indeks;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wydzial = wydzial;
        this.kierunek = kierunek;
        this.grupa = grupa;
    }
    

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    
    public Integer getIndeks() {
        return indeks;
    }
    public void setIndeks(Integer indeks) {
        this.indeks = indeks;
    }

    public String getImie() {
        return imie;
    }
    public void setImie(String imie) {
        this.imie = imie;
    }
    
    public String getNazwisko() {
        return nazwisko;
    }
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    
    public String getWydzial() {
        return wydzial;
    }
    public void setWydzial(String wydzial) {
        this.wydzial = wydzial;
    }
    
    public String getKierunek() {
        return kierunek;
    }
    public void setkierunek(String kierunek) {
        this.kierunek = kierunek;
    }
    
    public String getGrupa() {
        return grupa;
    }
    public void setGrupa(String grupa) {
        this.grupa = grupa;
    }
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StudentEntity)) {
            return false;
        }
        StudentEntity other = (StudentEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "project.StudentEntity[ id=" + id + " ]";
    }
    
}
