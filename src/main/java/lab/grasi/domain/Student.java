package lab.grasi.domain;



import lab.grasi.service.TimeService;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.*;

import java.io.Serializable;
import java.util.Objects;


//import java. sql. Timestamp;
/**
 * A Student.
 */
@Entity
@Table(name = "student")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Student implements Serializable {

    //private TimeService timeservice;

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @NotNull
    @Column(name = "matrikelnummer", nullable = false, unique = false)
    private Long matrikelnummer;

    @NotNull
    @Size(min = 2, max = 50)
    @Column(name = "nachname", length = 50, nullable = false)
    private String nachname;

    @NotNull
    @Size(min = 2, max = 50)
    @Column(name = "vorname", length = 50, nullable = false)
    private String vorname;

    @NotNull
    @Size(min = 2, max = 100)
    @Column(name = "strasse_und_hausnummer", length = 100, nullable = false)
    private String strasse_und_hausnummer;

    @NotNull
    @Column(name = "postleitzahl", nullable = false)
    private Integer postleitzahl;

    @NotNull
    @Size(min = 2, max = 100)
    @Column(name = "ort", length = 100, nullable = false)
    private String ort;
    //


    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMatrikelnummer() {
        int zähler = 001;
        String years = String.valueOf(TimeService.getYears());
        String zählerString = String.valueOf(zähler);
        String matrikelnummerString = String.valueOf(matrikelnummer);

        zähler++;
        return Long.valueOf(years+matrikelnummerString+zählerString);

    }



    public Student matrikelnummer(Long matrikelnummer) {
        this.matrikelnummer = matrikelnummer;
        return this;
    }


    public void setMatrikelnummer(Long matrikelnummer) {
        //
        this.matrikelnummer = matrikelnummer;//TimeService.getYears()+30+00;//+zähler;
        //
    }

    public String getNachname() {
        return nachname;
    }

    public Student nachname(String nachname) {
        this.nachname = nachname;
        return this;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public Student vorname(String vorname) {
        this.vorname = vorname;
        return this;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getStrasse_und_hausnummer() {
        return strasse_und_hausnummer;
    }

    public Student strasse_und_hausnummer(String strasse_und_hausnummer) {
        this.strasse_und_hausnummer = strasse_und_hausnummer;
        return this;
    }

    public void setStrasse_und_hausnummer(String strasse_und_hausnummer) {
        this.strasse_und_hausnummer = strasse_und_hausnummer;
    }

    public Integer getPostleitzahl() {
        return postleitzahl;
    }

    public Student postleitzahl(Integer postleitzahl) {
        this.postleitzahl = postleitzahl;
        return this;
    }

    public void setPostleitzahl(Integer postleitzahl) {
        this.postleitzahl = postleitzahl;
    }

    public String getOrt() {
        return ort;
    }

    public Student ort(String ort) {
        this.ort = ort;
        return this;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        if (student.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), student.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Student{" +
            "id=" + getId() +
            ", matrikelnummer=" + getMatrikelnummer() +
            ", nachname='" + getNachname() + "'" +
            ", vorname='" + getVorname() + "'" +
            ", strasse_und_hausnummer='" + getStrasse_und_hausnummer() + "'" +
            ", postleitzahl=" + getPostleitzahl() +
            ", ort='" + getOrt() + "'" +
            "}";
    }
}
