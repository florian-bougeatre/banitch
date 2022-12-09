package org.banitch.banitch_app.business.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public abstract class Personne {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "pseudo", nullable = false, unique = true)
    private String pseudo;

    @Column(name = "pseudo", nullable = false, unique = true)
    private String lienProfil;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getLienProfil() {
        return lienProfil;
    }

    public void setLienProfil(String lienProfil) {
        this.lienProfil = lienProfil;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "id=" + id +
                ", pseudo='" + pseudo + '\'' +
                ", lienProfil='" + lienProfil + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Personne personne)) return false;

        if (!id.equals(personne.id)) return false;
        if (!pseudo.equals(personne.pseudo)) return false;
        return lienProfil.equals(personne.lienProfil);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + pseudo.hashCode();
        result = 31 * result + lienProfil.hashCode();
        return result;
    }
}
