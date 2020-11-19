/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package champollion;

import java.util.Date;

/**
 *
 * @author Benjamin
 */
public class Intervention {
    private Salle s;
    private UE u;
    private Enseignant e;
    private Date debut;
    private int duree;
    private boolean annulee = false;
    private TypeIntervention type;

    public Intervention(Salle s, UE u, Enseignant e, Date debut, int duree, TypeIntervention type) {
        this.s = s;
        this.u = u;
        this.e = e;
        this.debut = debut;
        this.duree = duree;
        this.type = type;
    }

    public Salle getS() {
        return s;
    }

    public UE getU() {
        return u;
    }

    public Enseignant getE() {
        return e;
    }

    public Date getDebut() {
        return debut;
    }
    
    public TypeIntervention getType() {
        return type;
    }

    public int getDuree() {
        return duree;
    }

    public void setS(Salle s) {
        this.s = s;
    }

    public void setU(UE u) {
        this.u = u;
    }

    public void setE(Enseignant e) {
        this.e = e;
    }

    public void setDebut(Date debut) {
        this.debut = debut;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public void setType(TypeIntervention type) {
        this.type = type;
    }
}
